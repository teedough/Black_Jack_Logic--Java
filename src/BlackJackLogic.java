import java.util.ArrayList;

public class BlackJackLogic {


    public int DealersHand(ArrayList<Integer> cards) {

        ArrayList<Integer> hand = new ArrayList<>();
        hand.addAll(cards); //adds cards to the dealer's hand
        int total = AddHands(hand); //method to add hands

        return total;
    }

    public int PlayersHand(String name, ArrayList<Integer> cards,ArrayList<Integer> dealersHand) {

        System.out.println(name);

        ArrayList<Integer> hand = new ArrayList<>();
        hand.addAll(cards); //adds all cards to the dealer's hand

       // DealersHand(dealersHand); //to compare with

        int aceValue = checkAce(hand); //check the value of ace
        int total = AddHands(hand) + aceValue ; //method to add hands


        CheckPlayerStatus(hand, dealersHand);

        return total;

    }

    public int AddHands(ArrayList<Integer> hand) {


        int sum = 0;
        for (int i = 0; i < hand.size(); i++) {

            sum = sum + hand.get(i);
        }
        return sum;

    } //this method adds a total of hands each player has


    public void CheckPlayerStatus(ArrayList<Integer> hand, ArrayList<Integer> dealersHandTotal) {

        if (hand.size() == 5 && AddHands(hand) <= 21) {
            System.out.println("beats dealer: Five Cards");
        }
        else if (DealersHand(dealersHandTotal) < AddHands(hand) && !(AddHands(hand)> 21) ) {
            System.out.println("beats dealer : Greater Than Dealer");
        }
        else if (DealersHand(dealersHandTotal) > AddHands(hand)) {
            System.out.println("loses : Less Than Dealer");
        }
        else if (AddHands(hand) > 21) {
            System.out.println("loses : Greater than 21");
        }
        else if (DealersHand(dealersHandTotal) == AddHands(hand)) {
            System.out.println("wins");
        }
        else if (AddHands(hand) == 21){
            System.out.println("wins");
        }



    }


    public int checkAce(ArrayList<Integer> hand) {

        int aceVal = 0;

        for (int i = 0; i < hand.size(); i++) {

            if (hand.get(i) == 1) {

                int remainingCards = AddHands(hand) - 1; //check the remaining cards at hand

                if (remainingCards <= 10) {

                    aceVal = 10; //this is including the ace value already in the hands
                } else {
                    aceVal = 1;
                }

            }else aceVal = 0;
        }
        return aceVal;
    }

}









