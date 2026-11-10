
import java.util.*;

public class Q7_Redesign {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> oldPlaylist = new ArrayList<>();
        ArrayDeque<String> newPlaylist = new ArrayDeque<>();

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            oldPlaylist.add("Song" + i);
            newPlaylist.add("Song" + i);
        }

        System.out.print("Enter number of operations: ");
        int operations = sc.nextInt();

        long start1 = System.nanoTime();

        for (int i = 1; i <= operations; i++) {
            oldPlaylist.add("NewSong" + i);
            oldPlaylist.add(0, "UrgentSong" + i);
            oldPlaylist.remove(0);
        }

        long end1 = System.nanoTime();

        long start2 = System.nanoTime();

        for (int i = 1; i <= operations; i++) {
            newPlaylist.addLast("NewSong" + i);
            newPlaylist.addFirst("UrgentSong" + i);
            newPlaylist.removeFirst();
        }

        long end2 = System.nanoTime();

        System.out.println("\nOriginal ArrayList:");
        System.out.println(oldPlaylist);

        System.out.println("\nRedesigned ArrayDeque:");
        System.out.println(newPlaylist);

        System.out.println("\nPerformance Comparison:");

        System.out.println("ArrayList time: " +
                (end1 - start1) + " ns");

        System.out.println("ArrayDeque time: " +
                (end2 - start2) + " ns");

        System.out.println("\nFinal sizes:");
        System.out.println("ArrayList: " + oldPlaylist.size());
        System.out.println("ArrayDeque: " + newPlaylist.size());

        sc.close();
    }
}
