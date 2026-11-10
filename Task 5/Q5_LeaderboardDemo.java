
import java.util.*;

class Team {

    String name;
    int points;
    int goalDifference;

    Team(String name, int points, int goalDifference) {
        this.name = name;
        this.points = points;
        this.goalDifference = goalDifference;
    }

    public String toString() {
        return name + "(" + points + "," + goalDifference + ")";
    }
}

class Leaderboard<T> {

    ArrayList<T> teams;
    Comparator<T> order;

    Leaderboard(List<? extends T> items, Comparator<T> order) {
        teams = new ArrayList<>(items);
        this.order = order;
    }

    void display() {
        teams.sort(order);
        System.out.println(teams);
    }
}

public class Q5_LeaderboardDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Team> teams = new ArrayList<>();

        System.out.print("Enter number of teams: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter team " + (i + 1) + " details:");

            System.out.print("Team name: ");
            String name = sc.next();

            System.out.print("Points: ");
            int points = sc.nextInt();

            System.out.print("Goal difference: ");
            int goal = sc.nextInt();

            teams.add(new Team(name, points, goal));
        }

        Comparator<Team> order =
            Comparator.comparingInt((Team t) -> t.points).reversed()
            .thenComparing(
                Comparator.comparingInt((Team t) -> t.goalDifference).reversed()
            )
            .thenComparing(t -> t.name);

        Leaderboard<Team> leaderboard =
            new Leaderboard<>(teams, order);

        System.out.println("\nTeam Leaderboard:");
        leaderboard.display();

        sc.close();
    }
}
