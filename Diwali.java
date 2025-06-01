package com.diwali;
import java.util.*;

public class Diwali {
    public static void main(String[] args) {
        // Example 2 input
        List<Integer> productPrices = Arrays.asList(10, 20, 30, 40, 50, 50, 60);

        System.out.println("Product Price List: " + productPrices);

        // Call the function to process the offer
        processBOGOOffer(productPrices);
    }

    public static void processBOGOOffer(List<Integer> prices) {
        // Step 1: Sort the prices in descending order
        List<Integer> sortedPrices = new ArrayList<>(prices);
        sortedPrices.sort(Collections.reverseOrder());

        List<Integer> payableItems = new ArrayList<>();
        List<Integer> freeItems = new ArrayList<>();

        // Step 2: Pair the highest price item with the next highest eligible item
        int i = 0;
        while (i < sortedPrices.size()) {
            // Buy this item
            payableItems.add(sortedPrices.get(i));
            i++;

            // If there's another item available, get it for free
            if (i < sortedPrices.size()) {
                freeItems.add(sortedPrices.get(i));
                i++;
            }
        }

        // Step 3: Sort output lists in descending order (optional, for consistent format)
        Collections.sort(payableItems, Collections.reverseOrder());
        Collections.sort(freeItems, Collections.reverseOrder());

        // Output
        System.out.println("Discounted Items (Free): " + freeItems);
        System.out.println("Payable Items: " + payableItems);
    }
}




