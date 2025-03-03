import java.util.Scanner;

public class QualityRate2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of ratings: ");
        int num = input.nextInt();
        int ones = 0, twos = 0, threes = 0, fours = 0, fives = 0;

        int[] rate = new int[num];

        for (int i = 0; i < rate.length; i++)
        {

            do {
                System.out.println("Enter rate "+ (i + 1) +" From 1-5 (Extremely Bad to Extremely Good)");
                rate[i] = input.nextInt();


                if (rate[i] < 1 || rate[i] > 5)
                
                System.out.println("INVALID!!! Enter any number from 1-5");

    
    
            } while (rate[i] < 1 || rate[i] > 5);
           
           
        }




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
           System.out.println("\n------------------");
           System.out.println("1s: " + ones);
           System.out.println("2s: " + twos);
           System.out.println("3s: " + threes);
           System.out.println("4s: " + fours);
           System.out.println("5s: " + fives);
           System.out.println("------------------");
    }
}