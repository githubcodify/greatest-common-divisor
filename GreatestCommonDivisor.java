import java.util.InputMismatchException;
import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = 0, gcd = 0;
        boolean test = true;

        while (test) {
            try {
                System.out.println("enter n1");
                n1 = sc.nextInt();
                test = false;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("enter integer");
            }
        }

        if (n1 != 0) {
            System.out.println("n1: " + n1);
            int randomInt = 50 + (int) (Math.random() * 50);
            System.out.println("random number: " + randomInt);
            System.out.printf("1st number entered from the keyboard is %d, 2nd randomly selected number is %d \n", n1, randomInt);

            for (int i = 1; i <= n1 && i <= randomInt; ++i) {
                if (n1 % i == 0 && randomInt % i == 0) {
                    gcd = i;
                }
            }
            System.out.printf("The greatest common divisor for the numbers %d and %d is %d \n", n1, randomInt, gcd);
        } else {
            System.out.println("The program was terminated because 0 was entered from the keyboard.");
        }
    }
}


