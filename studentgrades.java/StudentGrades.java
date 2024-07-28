import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get number of subjects
        int numSubjects = 0;
        while (numSubjects <= 0) {
            System.out.print("Enter the number of subjects: ");
            numSubjects = scanner.nextInt();
            if (numSubjects <= 0) {
                System.out.println("Number of subjects must be positive.");
            }
        }
        
        // Array to store marks
        int[] marks = new int[numSubjects];
        
        // Get marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            int mark = -1;
            while (mark < 0 || mark > 100) {
                System.out.print("Enter marks for subject " + (i + 1) + " (0-100): ");
                mark = scanner.nextInt();
                if (mark < 0 || mark > 100) {
                    System.out.println("Marks must be between 0 and 100.");
                }
            }
            marks[i] = mark;
        }
        
        // Calculate total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        
        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;
        
        // Determine grade
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display results
        System.out.println("\n--- Results ---");
        System.out.printf("Total Marks: %d\n", totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.printf("Grade: %c\n", grade);
        
        scanner.close();
    }
}
