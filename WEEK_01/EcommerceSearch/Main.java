package WEEK_01.EcommerceSearch;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(3, "Laptop", "Electronics"),
            new Product(1, "Shampoo", "Personal Care"),
            new Product(2, "Notebook", "Stationery")
        };

        System.out.println("Linear Search Result: " + SearchFunction.linearSearch(products, 2));

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println("Binary Search Result: " + SearchFunction.binarySearch(products, 2));
    }
}

