package com.diwali;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiwaliBOGOOffer {

    public static void main(String[] args) {
        // Example input
        List<Integer> productPrices = Arrays.asList(10, 20, 30, 40, 50, 60);
        // You can test other inputs by changing the list above

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

        // Step 2: Traverse the sorted list and pair items
        int i = 0;
        while (i < sortedPrices.size()) {
            // Buy one item
            payableItems.add(sortedPrices.get(i));
            i++;

            // If there's another item left, make it free
            if (i < sortedPrices.size()) {
                freeItems.add(sortedPrices.get(i));
                i++;
            }
        }

        // Output the result
        System.out.println("Discounted Items (Free): " + freeItems);
        System.out.println("Payable Items: " + payableItems);
       
    }
}
