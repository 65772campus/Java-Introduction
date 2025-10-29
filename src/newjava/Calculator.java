package newjava;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to my Calculator, Please select an Operation.");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Type in your Operation (plus, minus, multiply, divide.)");
            String operation = scanner.next();

            System.out.println("Type in your First number");
            int firstNumber = scanner.nextInt();


            System.out.println("Type in your Second number");
            int secondNumber = scanner.nextInt();

            int result = 0;

            switch (operation) {
                case "plus": result = firstNumber + secondNumber; break;
                case "minus": result = firstNumber - secondNumber; break;
                case "multiply": result = firstNumber * secondNumber; break;
                case "divide": result = firstNumber / secondNumber; break;
                default: result = 0; break;
            }

            System.out.println("Your result is " + firstNumber + " " + operation + " " + secondNumber + " = " + result);

            System.out.println("\nDo you want to continue calculating? yes/no");
            if(!scanner.next().equals("yes")) {
                break;
            }




        }

    }
}
