import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = 3;
        int[] indexNumbers = new int[numStudents];
        int[] examScores = new int[numStudents];
        int[] assessmentScores = new int[numStudents];
        boolean[] feesPaid = new boolean[numStudents];
        int[] totalScores = new int[numStudents];
        char[] grades = new char[numStudents];
        boolean[] certified = new boolean[numStudents];

        int totalSum = 0;
        int minScore = Integer.MAX_VALUE;
        int maxScore = Integer.MIN_VALUE;

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter index number for student " + (i + 1) + ":");
            indexNumbers[i] = scanner.nextInt();
            
            System.out.println("Enter exam score:");
            examScores[i] = scanner.nextInt();
            
            System.out.println("Enter assessment score:");
            assessmentScores[i] = scanner.nextInt();
            
            System.out.println("Has the student paid fees? (true/false):");
            feesPaid[i] = scanner.nextBoolean();

            totalScores[i] = examScores[i] + assessmentScores[i];
            totalSum += totalScores[i];
            
            if (totalScores[i] < minScore) minScore = totalScores[i];
            if (totalScores[i] > maxScore) maxScore = totalScores[i];

            if ((examScores[i] >= 25 && assessmentScores[i] >= 15) || totalScores[i] >= 39) {
                grades[i] = assignGrade(totalScores[i]);
                certified[i] = feesPaid[i];
            } else {
                grades[i] = 'F';
                certified[i] = false;
            }
        }

        double averageScore = (double) totalSum / numStudents;

        System.out.println("\nStudent Results:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Index: " + indexNumbers[i] + ", Exam: " + examScores[i] + ", Assessment: " + assessmentScores[i] +
                               ", Total: " + totalScores[i] + ", Grade: " + grades[i] + ", Certified: " + (certified[i] ? "Yes" : "No"));
        }
        System.out.println("\nAverage Total Score: " + averageScore);
        System.out.println("Minimum Total Score: " + minScore);
        System.out.println("Maximum Total Score: " + maxScore);


        scanner.close();
    }

    public static char assignGrade(int totalScore) {
        if (totalScore >= 70) return 'A';
        if (totalScore >= 60) return 'B';
        if (totalScore >= 50) return 'C';
        if (totalScore >= 40) return 'D';
        return 'F';
    }

    
}
