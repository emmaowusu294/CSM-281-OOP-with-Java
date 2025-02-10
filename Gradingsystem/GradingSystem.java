import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter exam score: ");
        int examScore = input.nextInt();

        System.out.print("Enter assessment score: ");
        int assessmentScore = input.nextInt();

        System.out.print("Enter fee paid amount: ");
        int feesPaid = input.nextInt();

        // Checking pass/fail conditions
        boolean passedExam = examScore >= 25;
        boolean passedAssessment = (assessmentScore >= 15) && (assessmentScore <= 30);

        // Condonement logic (Only for specific cases)
        boolean condoned = (examScore == 25 && assessmentScore == 14) || (examScore == 24 && assessmentScore == 15);

        boolean paidFullFees = feesPaid == 100;

        // Checking student status
        if (!passedExam && !passedAssessment) {
            System.out.println("❌ You have failed both the exam and assessment. You are REPEATED.");
        } else if (passedExam && passedAssessment || condoned) {
            System.out.println("✅ You have passed all requirements.");
            if (paidFullFees) {
                System.out.println("🎓 Certificate Issued.");
            } else {
                System.out.println("⚠️ Pay full fees to get a certificate.");
            }
        } else {
            // Checking which component failed
            if (!passedExam) {
                System.out.println("❌ You FAILED the exam.");
            }
            if (!passedAssessment) {
                System.out.println("❌ You FAILED the assessment.");
            }
            if (paidFullFees) {
                System.out.println("🎓 Certificate Issued (if condoned).");
            }
        }

        input.close();
    }
}
