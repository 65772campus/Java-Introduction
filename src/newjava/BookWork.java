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
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers and i'll give you the sum, average, smallest and largest. ");

        System.out.println("Enter your first number: ");
        int firstNumber = input.nextInt();


        System.out.println("Enter your second number: ");
        int secondNumber = input.nextInt();


        System.out.println("Enter your third number: ");
        int thirdNumber = input.nextInt();


        int sum = firstNumber + secondNumber + thirdNumber;
        int average = (sum) / 3;  // the number divided at the end is how many numbers you got/inputs so change depending on inputs




    }
}
