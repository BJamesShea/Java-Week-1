import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Enter a one-digit number (0-9)");
        num = input.nextInt();

        if (num >= 0 && num <=9) {
            switch (num) {
                case 0:
                System.out.println("Zero");
                break;
                case 1:
                System.out.println("One");
                break;
                case 2:
                System.out.println("Two");
                break;
                case 3:
                System.out.println("Three");
                break;
                case 4:
                System.out.println("Four");
                break;
                case 5:
                System.out.println("Five");
                break;
                case 6:
                System.out.println("Six");
                break;
                case 7:
                System.out.println("Seven");
                break;
                case 8:
                System.out.println("Eight");
                break;
                case 9:
                System.out.println("Nine");
                break;
            default:
                break;
            }
        }  else {
            System.out.println("Invalid number!");
        }

        input.close();
    }
}