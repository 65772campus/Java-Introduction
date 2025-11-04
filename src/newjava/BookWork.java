package newjava;

import java.util.Scanner;

public class BookWork {
    public static void main(String[] args) {

//        /* DISPLAYING NUMBERS */
//        System.out.println("1, " + "2, " + "3, " + "4. ");
//        System.out.print("1 ");
//        System.out.print("2 ");
//        System.out.print("3 ");
//        System.out.print("4\n");
//
//
//        int x = 1;
//        int y = 2;
//        int z = 3;
//        int t = 4;
//
//
//        String result = String.format("The numbers are %d, %d, %d, %d", x, y, z, t);
//        System.out.println(result);


//        /* SHOPPING APP */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your first item's price: ");
//        double firstItem = input.nextDouble();
//
//        System.out.println("Enter your second item's price:  ");
//        double secondItem = input.nextDouble();
//
//        System.out.println("Now enter your final item's price:  ");
//        double thirdItem = input.nextDouble();
//
//        double total =  firstItem + secondItem + thirdItem;
//
//
//        double discountPercentage = 0.10;
//        double discountTotal = total * (1 - discountPercentage);
//
//
//
//
//
//        System.out.printf("Your total after a 10%% discount is: $%.2f%n", + discountTotal);
//
//        input.close();


//        /* WEEKDAY/WEEKEND */
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is the current day (enter between 1-7) ");
//        int date = Integer.parseInt(input.next());
//
//
//        if (date > 0 && date <= 5) {
//            System.out.println("It's a Working Day");
//        }
//        else if (date > 5 && date <= 7  ) {
//            System.out.println("It's the Weekend!");
//        }
//        else {
//            System.out.println("Invalid");
//        }


//        switch(date){
//            case 1: System.out.println("It's Monday, Working Day"); break;
//            case 2: System.out.println("It's Tuesday, Working Day"); break;
//            case 3: System.out.println("It's Wednesday, Working Day"); break;
//            case 4: System.out.println("It's Thursday, Working Day"); break;
//            case 5: System.out.println("It's Friday, Working Day"); break;
//            case 6: System.out.println("It's The Weekend!"); break;
//            case 7: System.out.println("It's The Weekend!"); break;
//
//            default: System.out.println("Please enter a correct number next time, and try again."); break;
//        }






        /* ARITHMETIC */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter three numbers, and I'll give you the sum, average, smallest and largest. ");
//
//        System.out.println("Enter your first number: ");
//        int firstNumber = input.nextInt();
//
//
//        System.out.println("Enter your second number: ");
//        int secondNumber = input.nextInt();
//
//
//        System.out.println("Enter your third number: ");
//        int thirdNumber = input.nextInt();
//
//        int smallest = firstNumber;
//        int largest = firstNumber;
//
//        if (secondNumber < smallest) smallest = secondNumber;
//        if (thirdNumber < smallest) smallest = thirdNumber;
//
//        if (secondNumber > largest) largest = secondNumber;
//        if (thirdNumber > largest) largest = thirdNumber;
//
//
//        int sum = firstNumber + secondNumber + thirdNumber;
//        int average = (sum) / 3;  // the number divided at the end is how many numbers you got/inputs so change depending on inputs
//
//        System.out.println("The sum is: " + sum);
//        System.out.println("The average is: " + average);
//        System.out.println("The smallest is: " + smallest + "\nand largest is: " + largest);







        /* DISPLAYING SHAPES AND ASTERISKS */

//        System.out.println("*************       ***      *        *    ");
//        System.out.println("*           *      *   *    ***      * *   ");
//        System.out.println("*           *      *   *   *****    *   *  ");
//        System.out.println("*           *      *   *     *       * *   ");
//        System.out.println("*           *       ***      *        *    ");
//        System.out.println("*           *                        ");
//        System.out.println("*           *                        ");
//        System.out.println("*           *                        ");
//        System.out.println("*************                        ");










        /* ODD OR EVEN */
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a number and I will give you an ODD or EVEN Answer: ");
//        int inputNumber = input.nextInt();
//
//        if (inputNumber % 2 == 0) {
//            System.out.println("Your result is Even: " + inputNumber);
//        } else {
//            System.out.println("Your result is Odd: " + inputNumber);
//        }










//        /* MULTIPLE */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your first number: ");
//        int firstNumber = scanner.nextInt();
//
//        System.out.println("Enter your second number: ");
//        int secondNumber = scanner.nextInt();
//
//        if (firstNumber % secondNumber == 0) {
//            System.out.println(firstNumber + " Is a multiple of " + secondNumber);
//        }









        /* DIAMETER & CIRCUMFERENCE */

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the radius of the circle");
//        double radius = input.nextDouble();
//
//
//        double diameter = 2 * radius;
//        double circumference = 2 * Math.PI * radius;
//        double area = Math.PI * radius * radius;
//
//
//        System.out.println("Diameter: " + diameter);
//        System.out.println("Circumference: " + circumference);
//        System.out.println("Area: " + area);








        /* INTEGER EQUIVALENT OF A CHARACTER */

        // Characters
//        char letterA = 'A';
//        char letterB = 'B';
//        char letterC = 'C';
//
//        char lowerA = 'a';
//        char lowerB = 'b';
//        char lowerC = 'c';
//
//        char num0 = '0';
//        char num1 = '1';
//        char num2 = '2';
//
//        char special1 = '$';
//        char special2 = '*';
//        char special3 = '+';
//        char special4 = '/';
//        char special5 = ' ';
//
//
//
//        // Values
//        int valueA = (int) letterA;
//        int valueB = (int) letterB;
//        int valueC = (int) letterC;
//
//        int valuelowerA = (int) lowerA;
//        int valuelowerB = (int) lowerB;
//        int valuelowerC = (int) lowerC;
//
//        int value0 = (int) num0;
//        int value1 = (int) num1;
//        int value2 = (int) num2;
//
//        int valuespecial1 = (int) special1;
//        int valuespecial2 = (int) special2;
//        int valuespecial3 = (int) special3;
//        int valuespecial4 = (int) special4;
//        int valuespecial5 = (int) special5;
//
//
//
//
//        System.out.println("A = " + valueA);
//        System.out.println("B = " + valueB);
//        System.out.println("C = " + valueC);
//
//        System.out.println("a = " + valuelowerA);
//        System.out.println("b = " + valuelowerB);
//        System.out.println("c = " + valuelowerC);
//
//        System.out.println("0 = " + value0);
//        System.out.println("1 = " + value1);
//        System.out.println("2 = " + value2);
//
//        System.out.println("$ = " + valuespecial1);
//        System.out.println("* = " + valuespecial2);
//        System.out.println("+ = " + valuespecial3);
//        System.out.println("/ = " + valuespecial4);
//        System.out.println("Space = " + valuespecial5);







        /* DIGITS OF AN INTEGER */

        Scanner input = new Scanner(System.in);
        System.out.println("Input a 5 digit number: ");
        int num = input.nextInt();

        String numString = String.valueOf(num);

        if (numString.length() == 5){
            for (int i = 0; i < numString.length(); i++) {
                System.out.print(numString.charAt(i) + " ");
            }
        }














    }
}

