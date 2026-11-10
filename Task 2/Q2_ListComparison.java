
import java.util.*;

public class Q2_ListComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            arrayList.add(value);
            linkedList.add(value);
            arrayDeque.add(value);
        }

        System.out.println("\nOriginal Collections:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("ArrayDeque: " + arrayDeque);

        System.out.print("\nEnter element to add at beginning: ");
        int value = sc.nextInt();

        arrayList.add(0, value);
        linkedList.addFirst(value);
        arrayDeque.addFirst(value);

        System.out.println("\nAfter adding at beginning:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("ArrayDeque: " + arrayDeque);

        arrayList.remove(0);
        linkedList.removeFirst();
        arrayDeque.removeFirst();

        System.out.println("\nAfter removing first element:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("ArrayDeque: " + arrayDeque);

        System.out.print("\nEnter index to access: ");
        int index = sc.nextInt();

        if (index >= 0 && index < arrayList.size()) {
            System.out.println("ArrayList element: " + arrayList.get(index));
            System.out.println("LinkedList element: " + linkedList.get(index));
        } else {
            System.out.println("Invalid index.");
        }

        System.out.println("\nFinal ArrayDeque:");
        System.out.println(arrayDeque);

        sc.close();
    }
}
