package newjava;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // INPUT & OUTPUT

        // OUTPUT
        // Outputting a String
        System.out.println("Hello, I am Kaupenjoe! And this is a Java Introduction for Minecraft Modding!");

        int life = 42;
        System.out.println(life);


        // You can also output Strings and Variables like this
        int grade = 80;
        System.out.println("Your grade is " + grade);




        /* INPUT */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("You just typed " + number);

        String input = scanner.next();
        System.out.println("You now just typed (String): " + input);







    }
}

