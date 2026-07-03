package dsa;

import java.util.*;
import java.math.*;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // System.out.println(a + b);
        // System.out.println(a - b);
        // System.out.println(a * b);
        // System.out.println(a / b);
        // System.out.println(a % b);

        // System.out.println(a > b);
        // System.out.println(a < b);
        // System.out.println(a >= b);
        // System.out.println(a <= b);
        // System.out.println(a != b);
        // System.out.println(a == b);

        Scanner scn = new Scanner(System.in);

        String username = scn.nextLine();
        String password = scn.nextLine();

        String dbusername = "nihal";
        String dbpassword = "nihal";

        if (username.equals(dbusername) && password.equals(dbpassword)) {
            System.out.println("welcome to side");
        } else {
            System.out.println("userpassword or username is invalid");
        }

    }

}