package Java_Questions;

import java.util.TreeMap;

public class CardGrouping {
    public static boolean canRearrangeIntoGroups(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> cardCountMap = new TreeMap<>();
        
        // Count the frequency of each card value
        for (int card : hand) {
            cardCountMap.put(card, cardCountMap.getOrDefault(card, 0) + 1);
        }

        // Try to form groups
        while (!cardCountMap.isEmpty()) {
            int firstKey = cardCountMap.firstKey();
            for (int i = 0; i < groupSize; i++) {
                int currentCard = firstKey + i;
                if (!cardCountMap.containsKey(currentCard)) {
                    return false;
                }
                int count = cardCountMap.get(currentCard);
                if (count == 1) {
                    cardCountMap.remove(currentCard);
                } else {
                    cardCountMap.put(currentCard, count - 1);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] hand1 = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize1 = 3;
        System.out.println(canRearrangeIntoGroups(hand1, groupSize1)); // true

        int[] hand2 = {1, 2, 3, 4, 5};
        int groupSize2 = 4;
        System.out.println(canRearrangeIntoGroups(hand2, groupSize2)); // false
    }
}
