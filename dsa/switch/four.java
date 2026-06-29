import java.util.*;

public class four {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int userinput = scn.nextInt();

        int i = 100;
        int count = 0;
        while (i <= userinput) {
            if (i % 2 == 0) {
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}
