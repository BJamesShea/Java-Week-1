import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
         try (Scanner input = new Scanner(System.in)) {
            int largest = Integer.MIN_VALUE;
            int value = 0;

            System.out.println("Enter 5 numbers separated by spaces.");
            for (int i = 0; i <= 4; i++) {
                value = input.nextInt();
                if (value > largest) {
                    largest = value;
                }
            }
             System.out.println("The largest nunber is: " + largest);
        }
    }
    
}
