import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number (-999 to exit): ");
            double number = scanner.nextDouble();

            if (number == -999) {
                break;
            }

            sum += number;
            count++;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Sum of numbers: " + sum);
            System.out.println("Average of numbers: " + average);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        scanner.close();
    }
    
}
