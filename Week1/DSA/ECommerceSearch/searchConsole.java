package Week1.DSA.ECommerceSearch;

import Week1.DSA.InventoryManagement.Inventory;
import Week1.DSA.InventoryManagement.Product;
import java.util.*;

public class searchConsole {

    // Linear Search by Product Name
    public static void linearSearchByName(Inventory inventory, String target) {
        boolean found = false;
        for (Map.Entry<Integer, Product> entry : inventory.getAllProducts()) {
            if (entry.getValue().name.equalsIgnoreCase(target)) {
                printProduct(entry.getKey(), entry.getValue());
                found = true;
            }
        }
        if (!found) System.out.println("Product not found (Linear Search).");
    }

    // Binary Search by Product Name
    public static void binarySearchByName(Inventory inventory, String target) {
        List<Map.Entry<Integer, Product>> products = inventory.getAllProducts();

        // Sort alphabetically by name
        products.sort(Comparator.comparing(entry -> entry.getValue().name.toLowerCase()));

        int low = 0, high = products.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            String midName = products.get(mid).getValue().name.toLowerCase();
            int cmp = target.toLowerCase().compareTo(midName);

            if (cmp == 0) {
                printProduct(products.get(mid).getKey(), products.get(mid).getValue());
                return;
            } else if (cmp < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Product not found (Binary Search).");
    }

    private static void printProduct(int id, Product p) {
        System.out.printf("Found -> ID: %d, Name: %s, Price: %d, Quantity: %d\n", id, p.name, p.price, p.quantity);
    }
}
