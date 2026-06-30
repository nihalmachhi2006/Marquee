package dsa.debug;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int userinput = scn.nextInt();
        int originalInput = userinput;
        int reverse = 0;

        while (userinput > 0) {
            int digit = userinput % 10;
            reverse = reverse * 10 + digit;
            userinput /= 10;
        }
        if (originalInput == reverse) {
            System.out.println("given number is palindrome");
        } else {
            System.out.println("given number is not a palindrome");
        }
    }

}
