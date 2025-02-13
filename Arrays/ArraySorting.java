package Arrays;
public class ArraySorting {
    public static void main(String[] args)  
    {
        int[] a = {3, 5, 1, 2, 4};
        int i, j, temp;

        // Bubble Sort Algorithm
        for (i = 4; i >= 0; i--) {
            for (j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
