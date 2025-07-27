import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter age: ");
        int a = sc.nextInt();
        System.out.print("Enter registration number: ");
        int regno = sc.nextInt();
        System.out.print("Enter branch: ");
        String branch = sc.next();
        System.out.print("Enter section: ");
        char section = sc.next().charAt(0);
        System.out.print("Enter course: ");
        String coursee = sc.next();
        System.out.print("Enter college: ");
        String college = sc.next();

        sc.close();

        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + a);
        System.out.println("Registration Number: " + regno);
        System.out.println("Branch: " + branch);
        System.out.println("Section: " + section);
        System.out.println("Course: " + coursee);
        System.out.println("College: " + college);
    }
}
