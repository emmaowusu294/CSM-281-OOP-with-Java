import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] total = new int[5];

        int b[][] = {{1, 2, 4, 7, 6}, {3, 4, 5, 9, 0}};

        // Summing the columns
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {  // Fixed 'lenght' to 'length'
                total[j] += b[i][j];  // Summing values column-wise
            }
        }

        // Printing total array
        System.out.println("Column-wise sums:");
        for (int i = 0; i < total.length; i++) {
            System.out.println("Column " + (i + 1) + ": " + total[i]);
        }

        input.close();  // Close the scanner
    }
}
