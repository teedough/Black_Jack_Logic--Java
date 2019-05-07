import java.util.ArrayList;

public class Main {

    enum Rank {
        ACE(1), Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7),
        Eight(8), Nine(9), Ten(10), Jack(10), Queen(10), King(10),
        ;

        public int val;

        Rank(int value) {
            this.val = value;
        }

    } //immutable values

    public static void main(String [] args){
        BlackJackLogic blackJack = new BlackJackLogic();

        //AS PER TEST CASE:

        //Dealer
        ArrayList<Integer> dealersHand = new ArrayList<>();
        dealersHand.add(Rank.Jack.val);
        dealersHand.add(Rank.Nine.val);
        System.out.println("Dealer" + "\n" + blackJack.DealersHand(dealersHand) + "\n");


        //Billy
        ArrayList<Integer> BillysCard = new ArrayList<>();
        BillysCard.add(Rank.Two.val);
        BillysCard.add(Rank.Two.val);
        BillysCard.add(Rank.Two.val);
        BillysCard.add(Rank.Four.val);
        BillysCard.add(Rank.Five.val);
        System.out.println(blackJack.PlayersHand("Billy",BillysCard, dealersHand) + "\n");
        //Andrew
        ArrayList<Integer> AndrewsHand = new ArrayList<>();
        AndrewsHand.add(Rank.King.val);
        AndrewsHand.add(Rank.Four.val);
        AndrewsHand.add(Rank.Four.val);
        System.out.println(blackJack.PlayersHand("Andrew",AndrewsHand, dealersHand)+ "\n");

        //Lemmys
        ArrayList<Integer> LemmysHand = new ArrayList<>();
        LemmysHand.add(Rank.ACE.val);
        LemmysHand.add(Rank.Two.val);
        LemmysHand.add(Rank.ACE.val);
        System.out.println(blackJack.PlayersHand("Lemmy",LemmysHand,dealersHand)+ "\n");

        //Carla
        ArrayList<Integer> CarlasHand = new ArrayList<>();
        CarlasHand.add(Rank.Queen.val);
        CarlasHand.add(Rank.Six.val);
        CarlasHand.add(Rank.Nine.val);
        System.out.println(blackJack.PlayersHand("Carla",CarlasHand, dealersHand));

    }
}
