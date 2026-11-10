
import java.util.*;

class Patient {

    String name;
    int severity;
    int arrival;

    Patient(String name, int severity, int arrival) {
        this.name = name;
        this.severity = severity;
        this.arrival = arrival;
    }
}

public class Q6_Triage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Patient> queue = new PriorityQueue<>(
            (p1, p2) -> {
                if (p1.severity != p2.severity) {
                    return p1.severity - p2.severity;
                }
                return p1.arrival - p2.arrival;
            }
        );

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter patient " + i + " details:");

            System.out.print("Patient name: ");
            String name = sc.next();

            System.out.print("Severity (1-5): ");
            int severity = sc.nextInt();

            queue.add(new Patient(name, severity, i));
        }

        System.out.println("\nPatient Treatment Order:");

        while (!queue.isEmpty()) {

            Patient p = queue.poll();

            System.out.println(
                p.name + " (Severity " + p.severity + ")"
            );
        }

        sc.close();
    }
}
