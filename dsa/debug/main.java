package dsa.debug;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int userinput = scn.nextInt();
        // int originalInput = userinput;
        // int reverse = 0;

        // while (userinput > 0) {
        // int digit = userinput % 10;
        // reverse = reverse * 10 + digit;
        // userinput /= 10;
        // }
        // if (originalInput == reverse) {
        // System.out.println("given number is palindrome");
        // } else {
        // System.out.println("given number is not a palindrome");
        // }

        String ch = scn.next();
        for (int i = 0; i < ch.length(); i++) {
            for (int j = 0; i < ch.length() - i; j++) {
                if (j != i) {
                    System.out.println(ch.charAt(j) + " ");
                }
            }
            System.out.println(" ");
        }
    }

}
