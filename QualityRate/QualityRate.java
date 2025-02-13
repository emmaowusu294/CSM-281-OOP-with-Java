 //Question
/* 20 students were asked to rate the quality of teaching of Java on the scale of 1-5
 * 
 * The responses obtained are as follows
 * 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 2, 5, 3, 4, 5, 3, 1
 * 
 * Write a Java Program that outputs the frequency of each of the numbers
 */

public class QualityRate {
    public static void main(String[] args) {
        int[] rate = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 2, 5, 3, 4, 5, 3, 1};
        int ones = 0, twos = 0, threes = 0, fours = 0, fives = 0;

        // Count occurrences of each rating
        for (int i = 0; i < rate.length; i++) {
            if (rate[i] == 1) 
                ones++;
            else if (rate[i] == 2) 
                twos++;
            else if (rate[i] == 3) 
                threes++;
            else if (rate[i] == 4) 
                fours++;
            else if (rate[i] == 5) 
                fives++;
        }

        // Display the counts
        System.out.println("1s: " + ones);
        System.out.println("2s: " + twos);
        System.out.println("3s: " + threes);
        System.out.println("4s: " + fours);
        System.out.println("5s: " + fives);
    }
}
