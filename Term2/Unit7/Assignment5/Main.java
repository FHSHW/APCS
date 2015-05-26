import java.util.ArrayList;

class Main {
    public static void main (String[] args) {
        Deck d = new Deck();
        ArrayList<Card> largest = new ArrayList<Card>();
        ArrayList<ArrayList<Card>> hands = new ArrayList<ArrayList<Card>>();
        for (int i = 0; i < 2; i++)
            hands.add(new ArrayList<Card>());

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                Card c = d.getTopCard();
                hands.get(j).add(c);
            }
        }

        for (int i = 0; i < hands.size(); i++) {
            System.out.println(toString(hands.get(i), i));
            if (getScore(hands.get(i)) >= getScore(largest))
                largest = hands.get(i);
        }

        for (int i = 0; i < hands.size(); i++) {
            if (hands.get(i).equals(largest))
                System.out.println("Hand " + (i + 1) + " wins");
        }
    }

    static String toString(ArrayList<Card> cards, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hand " + (i + 1) + ": total points " + getScore(cards) + "\n");
        for (Card c : cards)
            sb.append(c.toString() + "\n");
        return sb.toString();
    }


    static int getScore(ArrayList<Card> cards) {
        int ret = 0;
        for (Card c : cards)
            ret += c.pointValue();
        return ret;
    }


//    static class Hand {
//        ArrayList<Card> cards = new ArrayList<Card>();
//        int instance = 0;
//        static int ins = 0;
//
//        Hand() {
//            this.instance = ins++;
//        }
//
//        public String toString() {
//            StringBuilder sb = new StringBuilder();
//            sb.append("Hand " + instance  + ": total points " + getScore() + "\n");
//            for (Card c : cards)
//                sb.append(c.toString() + "\n");
//            return sb.toString();
//        }
//
//        int getScore() {
//            int ret = 0;
//            for (Card c : this.cards)
//                ret += c.pointValue();
//            return ret;
//        }
//    }
}

