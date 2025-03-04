

public class OddEvenMatrices {
    public static void main(String[] args) {
        int[][] odd = new int[3][3];
        int[][] even = new int[3][3];

        int evenNumber = 2;
        int oddNumber = 1;
        


        

    // Even Numbers Matrix
        for(int i = 0; i < even.length; i++)
        {
            for(int j = 0; j < even[i].length; j++)
            {
             even[i][j] = evenNumber;
             evenNumber += 2;
                     
            }
        }


          

    // Odd Numbers Matrix
        for(int i = 0; i < odd.length; i++)
        {
            for(int j = 0; j < odd[i].length; j++)
            {
            odd[i][j] = oddNumber;
            oddNumber += 2;
                    
            }
        }
    


        // Printing the even matrix
        System.out.println("Even Matrix");
        for(int i = 0; i < even.length; i++)
        {
            for(int j = 0; j < even[i].length; j++)
            {
                System.out.print(even[i][j]+ "\t");
            }
            System.out.println();  // Move to the next line after printing a row
        }

        System.out.println("\n--------------");

        // Printing the odd matrix
        System.out.println("\nOdd Matrix");
        for(int i = 0; i < odd.length; i++)
        {
            for(int j = 0; j < odd[i].length; j++)
            {
                System.out.print(odd[i][j]+ "\t");
            }
            System.out.println();  // Move to the next line after printing a row
        }


        //  the product of the leading diagonal elements of both matrices and displaying the results
        // for all elements on the leading diagonal i = j like 00, 11, 22 etc
        int leadEven = 1;
        for(int i = 0; i < even.length; i++)
        {
            for(int j = 0; j < even[i].length; j++)
            {
                if (i == j) {
                    leadEven *= even[i][j];
                }
            }

        }

        System.out.println("\n1). Product of the leading diagonal on the even matrix is " + leadEven);



        // Odd leading Diagonal
        int leadOdd = 1;
        for(int i = 0; i < odd.length; i++)
        {
            for(int j = 0; j < odd[i].length; j++)
            {
                if (i == j) {
                    leadOdd *= odd[i][j];
                }
            }

        }

        System.out.println("\n2). Product of the leading diagonal on the odd matrix is " + leadOdd);


        //the product of the trailing diagonal elements of both matrices and displaying the results
        // for trailing diagonal the sum of i and j is the i-1 or j-1..eg for this ques the leading i + j will be 2

       // Even trailing diagonal 
        int trailEven = 1;
        for(int i = 0; i < even.length; i++)
        {
            for(int j = 0; j < even[i].length; j++)
            {
                if (i + j == 2) {
                    trailEven *= even[i][j];
                }
            }
        }
        System.out.println("\n3). Product of the trailing diagonal on the even matrix is " + trailEven);



         // Odd leading diagonal 
         int trailOdd = 1;
         for(int i = 0; i < odd.length; i++)
         {
             for(int j = 0; j < odd[i].length; j++)
             {
                 if (i + j == 2) {
                     trailOdd *= odd[i][j];
                 }
             }
         }
         System.out.println("\n4). Product of the trailing diagonal on the even matrix is " + trailOdd);



         //the difference of the product of the trailing and the leading diagonal elements
         System.out.println("\n5). The difference of the product of the trailing and the leading diagonal elements of the even matrix is " + (trailEven - leadEven));
         System.out.println("\n6). The difference of the product of the trailing and the leading diagonal elements of the odd matrix is " + (trailOdd - leadOdd));



         //the difference between the products of the trailing diagonal of the odd matrix and the trailing diagonal of the even matrix

         System.out.println("\n7). The difference between the products of the trailing diagonal of the odd matrix and the trailing diagonal of the even matrix is " +(trailEven - trailOdd));

 
 




        System.out.println("\n------------------------------------------------------------");
    }
}
