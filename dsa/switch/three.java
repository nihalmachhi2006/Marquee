
// package dsa.switch;
import java.util.*;

public class three {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // int userinput = scn.nextInt();
        // int i = 1;
        // int sum = 0;

        // while (i <= userinput) {
        // sum += (i * i * i);
        // i++;
        // System.out.println("The sum of the series up to " + userinput + " is: " +
        // sum);
        // }
        // scn.close();

        int i = 1000;
        int j = 100;
        int count = 0;
        while (j <= i) {
            if (j % 2 == 0) {
                System.out.println(i);
                count++;
                i++;
            }
        }
    }
}
