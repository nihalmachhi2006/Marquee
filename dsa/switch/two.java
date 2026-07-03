
// package dsa.switch;
import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int i = 1;
        int sum = 0;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (i <= 100) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);
    }
}
