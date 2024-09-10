import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);


        double result; 
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = firstNumber - secondNumber; 
                System.out.println("Result: " + result);
                break;

            case '*':
                result = firstNumber * secondNumber;
                System.out.println("Results: " + result);
                break; 

           case '/':
           if (secondNumber != 0) {
            result = firstNumber / secondNumber;
            System.out.println("Result: " + result);
           } else {
            System.out.println("Error: Division by zero is not allowed");
           }
           break;
        
        default:
           System.out.println("Invalid operator!");

        }

        scanner.close();
    
    }

}
