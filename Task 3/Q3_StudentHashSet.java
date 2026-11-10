
import java.util.*;

class Student {

    String regNo;
    String name;

    Student(String regNo, String name) {
        this.regNo = regNo;
        this.name = name;
    }

    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Student))
            return false;

        Student s = (Student) obj;

        return regNo.equals(s.regNo);
    }

    public int hashCode() {
        return regNo.hashCode();
    }

    public String toString() {
        return regNo + " - " + name;
    }
}

public class Q3_StudentHashSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Student> students = new HashSet<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter student " + (i + 1) + " details:");

            System.out.print("Registration Number: ");
            String regNo = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            students.add(new Student(regNo, name));
        }

        System.out.println("\nUnique Students:");

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\nTotal Unique Students: " + students.size());

        sc.close();
    }
}
