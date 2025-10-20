package newjava;

public class Main {
    public static void main(String[] args) {
        /* DATA TYPES & VARIABLES */


        // This is a comment

        /*
        This is a multiline comment

        */

        /* Variables */

        // datatype name_of_variable; // Declaration
        // OR
        // datatype name_of_variable = value_of_variable; // Initialization (Declaration + Assignment of value)

        /* DATA TYPES */



        // Integers (Store whole numbers (including negative ones))
        // Go from -2147483648 to 2147483647
        int points;    // Declaration
        points = 100;  // Assignment
        int x = -69;   // Initialization  (Declaration + Assignment)



        // Floating Point Numbers (float & double)
        float pi = 3.14159265f;
        double e = 2.718281828;

        // For real numbers, however! Precision can be an issue!
        // Scientific notation: 314159265 * 10^-8



        // Booleans (True or False)
        boolean likedvideo = true;
        boolean subscribed = false;



        // Chars & Strings
        char grade = 'B';
        String name = "Kaupenjoe";
        System.out.println(15);





        /* INTEGERS & MATH */

        int a = 100;
        int b = 200;

        // ADDITION
        int sum = a + b;
        System.out.println("Sum: " + sum);


        // SUBTRACTION
        int sub = a - b;
        System.out.println("Subtraction: " + sub);

        // MULTIPLICATION
        int multi = a * b;
        System.out.println("Multiplication: " + multi);

        // DIVISION
        int division = a / b;
        System.out.println("Division: " + division);

        division = b / a;
        System.out.println("Division: " + division);


        // NO DIVISION BY 0
        // division = b / 0;
        // System.out.println("Division: " + division);


        // REMAINDER (MODULO)
        int remainder = 100 % 2;
        System.out.println("Remaining from 100/2: " + remainder);



        // SOME MATH METHODS
        System.out.println("Absolute: " + Math.abs(-100));


        System.out.println("Ceiling: " + Math.ceil(1.23));
        System.out.println("Round: " + Math.round(1.23));
        System.out.println("Floor: " + Math.floor(1.23));

        System.out.println("Minimum: " + Math.min(10, 200));
        System.out.println("Maximum: " + Math.max(37, 750));






        }
    }