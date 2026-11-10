
import java.util.Scanner;

public class Q1_StringComparison {

    static int tickets;
    static int fields;

    static String[][] data;

    static long buildUsingString() {
        long total = 0;

        for (int i = 0; i < tickets; i++) {
            String ticket = "";

            for (int j = 0; j < fields; j++) {
                ticket = ticket + data[i][j] + " ";
            }

            total += ticket.length();
        }

        return total;
    }

    static long buildUsingStringBuilder() {
        long total = 0;

        for (int i = 0; i < tickets; i++) {
            StringBuilder ticket = new StringBuilder();

            for (int j = 0; j < fields; j++) {
                ticket.append(data[i][j]).append(" ");
            }

            total += ticket.length();
        }

        return total;
    }

    static long buildUsingStringBuffer() {
        long total = 0;

        for (int i = 0; i < tickets; i++) {
            StringBuffer ticket = new StringBuffer();

            for (int j = 0; j < fields; j++) {
                ticket.append(data[i][j]).append(" ");
            }

            total += ticket.length();
        }

        return total;
    }

    static double measure(int choice) {
        long totalTime = 0;

        for (int i = 0; i < 5; i++) {
            long start = System.nanoTime();

            if (choice == 1)
                buildUsingString();
            else if (choice == 2)
                buildUsingStringBuilder();
            else
                buildUsingStringBuffer();

            long end = System.nanoTime();
            totalTime += end - start;
        }

        return totalTime / 5.0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tickets: ");
        tickets = sc.nextInt();

        System.out.print("Enter number of fields per ticket: ");
        fields = sc.nextInt();

        data = new String[tickets][fields];

        for (int i = 0; i < tickets; i++) {
            for (int j = 0; j < fields; j++) {
                data[i][j] = "Field" + (j + 1);
            }
        }

        buildUsingString();
        buildUsingStringBuilder();
        buildUsingStringBuffer();

        System.out.println("\nAverage Execution Time:");

        System.out.println("String: " +
                measure(1) + " ns");

        System.out.println("StringBuilder: " +
                measure(2) + " ns");

        System.out.println("StringBuffer: " +
                measure(3) + " ns");

        System.out.println("\nTicket generation completed.");

        sc.close();
    }
}
