public class MatrixCalculations {
    public static void main(String[] args) {
        int[][] odd = new int[3][3];
        int[][] even = new int[3][3];

        int evenNumber = 2;
        int oddNumber = 1;

        // Filling matrices with even and odd numbers
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                even[i][j] = evenNumber;
                odd[i][j] = oddNumber;
                evenNumber += 2;
                oddNumber += 2;
            }
        }

        // Printing Even Matrix
        System.out.println("Even Matrix:");
        printMatrix(even);

        System.out.println("\n---------------------");

        System.out.println("\nOdd Matrix:");
        printMatrix(odd);

        // Initializing diagonal products
        int leadEven = 1, leadOdd = 1;
        int trailEven = 1, trailOdd = 1;

        // Loop through matrices to compute diagonal products
        for (int i = 0; i < 3; i++) {
            leadEven *= even[i][i];  // Leading diagonal of even matrix
            leadOdd *= odd[i][i];    // Leading diagonal of odd matrix
            trailEven *= even[i][2 - i]; // Trailing diagonal of even matrix
            trailOdd *= odd[i][2 - i];   // Trailing diagonal of odd matrix
        }

        // Display results
        System.out.println("\n1). Product of leading diagonal (Even Matrix): " + leadEven);
        System.out.println("\n2). Product of leading diagonal (Odd Matrix): " + leadOdd);
        System.out.println("\n3). Product of trailing diagonal (Even Matrix): " + trailEven);
        System.out.println("\n4). Product of trailing diagonal (Odd Matrix): " + trailOdd);
        System.out.println("\n5). Difference (Trailing - Leading) [Even Matrix]: " + (trailEven - leadEven));
        System.out.println("\n6). Difference (Trailing - Leading) [Odd Matrix]: " + (trailOdd - leadOdd));
        System.out.println("\n7). Difference (Trailing Even - Trailing Odd): " + (trailEven - trailOdd));



        System.out.println("\n------------------------------------------------------");
    }

    // Function to print a 2D matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
