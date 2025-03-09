public class EvenOddNumbers {
    public static void main(String[] args) {

        // Printing even numbers between 0 and 20
        System.out.println("Even Numbers");
        for (int i = 0; i <= 20; i++)
       {
         
         if (i % 2 == 0)
         {
           System.out.println(i);
           
        }

      }
      



        // Printing odd numbers between 0 and 20
        System.out.println("\n\nOdd Numbers");
       for (int i = 0; i <= 20; i++)
       {
        if (i % 2 != 0)    
         {
           System.out.println(i); // Printing the odd numbers
          
        }
       
       }

    }
}