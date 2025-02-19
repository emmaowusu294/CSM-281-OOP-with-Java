import java.util.Scanner;

public class GradingSystemSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int examScore, assessmentScore, fee;
        char grade;

        while (true) {
            System.out.print("Enter exam score (-1 to stop): ");
            examScore = input.nextInt();
            if (examScore == -1) {
                break; // Exit the loop if sentinel value is entered
            }

            System.out.print("Enter assessment score: ");
            assessmentScore = input.nextInt();

            System.out.print("Enter fee payment status (100 for paid, 0 for not paid): ");
            fee = input.nextInt();

            int totalScore = examScore + assessmentScore;

            // Check passing requirements
            boolean passedExam = examScore >= 25;
            boolean passedAssessment = assessmentScore >= 15;
            boolean passedOverall = passedExam && passedAssessment;
            boolean condoned = totalScore == 39 && (examScore >= 24 && assessmentScore >= 14);

            System.out.println("\n--- Student Result ---");

            switch (passedOverall || condoned ? 1 : 0) { // Using switch for pass/fail
                case 1:
                    switch (fee == 100 ? 1 : 0) { // Using switch for fee payment
                        case 1:
                            System.out.println("Status: Passed - Certificate Issued");

                            switch (totalScore / 10) { // Using switch for grade calculation
                                case 7:
                                case 8:
                                case 9:
                                case 10: // Handles scores 70-100
                                    grade = 'A';
                                    break;
                                case 6:
                                    grade = 'B';
                                    break;
                                case 5:
                                    grade = 'C';
                                    break;
                                case 4:
                                    grade = 'D';
                                    break;
                                default:
                                    grade = 'F'; // For scores below 40 (shouldn't happen if passed except condoned)
                            }
                            System.out.println("Grade: " + grade);
                            break;
                        case 0:
                            System.out.println("Status: Passed - Certificate Pending (Fees not paid)");
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Status: Failed");
                    switch (passedExam ? 0 : 1) { // Nested switch for exam feedback
                        case 1:
                            System.out.println("Reason: Failed Exam");
                            break;
                    }
                    switch (passedAssessment ? 0 : 1) { // Nested switch for assessment feedback
                        case 1:
                            System.out.println("Reason: Failed Assessment");
                            break;
                    }
                    if (!passedExam && !passedAssessment){
                        System.out.println("Action: Repeat");
                    }
                    break;
            }
            System.out.println("---------------------\n");
        }
        input.close();
        System.out.println("Program terminated.");
    }
}