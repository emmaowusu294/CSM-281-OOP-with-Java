import java.util.Scanner;

public class GradingSystemIfElseIf {

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

            System.out.print("Enter assessment score: ");-900  
            assessmentScore = input.nextInt();

            System.out.print("Enter fee payment status (100 for paid, 0 for not paid): ");
            fee = input.nextInt();

            int totalScore = examScore + assessmentScore;

            // Check passing requirements
            boolean passedExam = examScore >= 25 && examScore <= 70;
            boolean passedAssessment = assessmentScore >= 15 && assessmentScore <= 30;
            boolean passedOverall = passedExam && passedAssessment;
            boolean condoned = totalScore == 39 && (examScore >= 24 && assessmentScore >= 14);

            // Checking user input correct ranges for the exam score and assessmentScore 
            if (examScore < 0 || examScore > 70) {
                System.out.println("\nEnter Correct range for the exam score----- 0 to 70");
            } 

            if (assessmentScore < 0 || assessmentScore > 30) {
                System.out.println("\nEnter Correct range for the assesment score---- 0 to 30");
            } 



            System.out.println("\n--- Student Result ---");

            if (passedOverall || condoned) {
                if (fee == 100) {
                    System.out.println("Status: Passed - Certificate Issued");

                    // Determine grade
                    if (totalScore >= 70) {
                        grade = 'A';
                    } else if (totalScore >= 60) {
                        grade = 'B';
                    } else if (totalScore >= 50) {
                        grade = 'C';
                    } else if (totalScore >= 40) {
                        grade = 'D';
                    } else {
                        grade = 'F'; // Should not happen if passed unless condoned
                    }
                    System.out.println("Grade: " + grade);


                } else {
                    System.out.println("Status: Passed - Certificate Pending (Fees not paid)");
                }
            } else {
                System.out.println("Status: Failed");
                if (!passedExam) {
                    System.out.println("Reason: Failed Exam");
                }
                if (!passedAssessment) {
                    System.out.println("Reason: Failed Assessment");
                }
                 if (!passedExam && !passedAssessment){
                    System.out.println("Action: Repeat");
                }
            }
            System.out.println("---------------------\n");


        }
        input.close();
        System.out.println("Program terminated.");
    }
}