package newjava;

import java.util.Scanner;

public class IfandSwitchStatements {
    public static void main(String[] args) {
          /* CONTROL FLOW (IF & SWITCH) */

        Scanner scanner = new Scanner(System.in);
        System.out.println("How muc health do you have?");
        int health = scanner.nextInt();
        boolean isAlive = health > 0;

        if(isAlive) {
            System.out.println("You are still alive!");
        } else {
            System.out.println("You have lost the game!");
        }

        System.out.println("");
    }
}
