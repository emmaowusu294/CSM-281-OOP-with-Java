public class EvenOddNumbers {
    public static void main(String[] args) {

        System.out.println("Even numbers between 0 and 20");
        for ( int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
           
        }


        System.out.println("Odd numbers between 0 and 20");
        for ( int i = 1; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
           
        }


    }
}