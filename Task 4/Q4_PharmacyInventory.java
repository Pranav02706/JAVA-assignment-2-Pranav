
import java.util.*;

public class Q4_PharmacyInventory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();

        System.out.print("Enter number of medicines: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter medicine code: ");
            int code = sc.nextInt();

            System.out.print("Enter medicine name: ");
            String name = sc.next();

            hashMap.put(code, name);
            treeMap.put(code, name);
            linkedMap.put(code, name);
        }

        System.out.println("\nHashMap Inventory:");
        long start = System.nanoTime();

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        long end = System.nanoTime();
        System.out.println("Report time: " + (end - start) + " ns");

        System.out.println("\nTreeMap Inventory:");
        start = System.nanoTime();

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        end = System.nanoTime();
        System.out.println("Report time: " + (end - start) + " ns");

        System.out.println("\nLinkedHashMap Inventory:");
        start = System.nanoTime();

        for (Map.Entry<Integer, String> entry : linkedMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        end = System.nanoTime();
        System.out.println("Report time: " + (end - start) + " ns");

        System.out.println("\nPerforming 100000 lookups:");

        start = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            hashMap.get(hashMap.keySet().iterator().next());
        }

        end = System.nanoTime();
        System.out.println("HashMap lookup time: " + (end - start) + " ns");

        start = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            treeMap.get(treeMap.firstKey());
        }

        end = System.nanoTime();
        System.out.println("TreeMap lookup time: " + (end - start) + " ns");

        start = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedMap.get(linkedMap.keySet().iterator().next());
        }

        end = System.nanoTime();
        System.out.println("LinkedHashMap lookup time: " + (end - start) + " ns");

        sc.close();
    }
}
