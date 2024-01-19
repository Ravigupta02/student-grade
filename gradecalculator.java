import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numberOfSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.println("Enter marks obtained in subject " + i + " (out of 100):");
            int marks = scanner.nextInt();

            // Validate input (marks should be between 0 and 100)
            while (marks < 0 || marks > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100. Please enter again:");
                marks = scanner.nextInt();
            }

            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks + " out of " + (numberOfSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + calculateGrade(averagePercentage));

        scanner.close();
    }

    private static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

