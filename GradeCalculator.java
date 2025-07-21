import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter USN: ");
        String usn = sc.nextLine();

        System.out.print("Enter total marks (out of 500): ");
        int totalMarks = sc.nextInt();

        double percentage = (totalMarks / 500.0) * 100;
        String grade;

        if (percentage >= 90) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B+";
        else if (percentage >= 60) grade = "B";
        else if (percentage >= 50) grade = "C";
        else grade = "Fail";

        System.out.println("\n----- Result -----");
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
