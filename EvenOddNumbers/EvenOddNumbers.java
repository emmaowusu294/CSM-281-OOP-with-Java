public class EvenOddNumbers {
    public static void main(String[] args) {

        // Printing even numbers between 0 and 20
        for (int i = 0; i <= 20; i++)
       {
            if (i == 0) continue;
         {
           System.out.print(i + 1 + ",");
           i++; 
        }
        if (i == 18) break;
       }



        // Printing odd numbers between 0 and 10
       for (int i = 0; i <= 20; i++)
       {
        if (i == 10) break;     // The loop stops if the i is 10
         {
           System.out.println(i + 1); // Printing the odd numbers
           i++; // Increasing to keep them odd
        }
       
       }

    }
}