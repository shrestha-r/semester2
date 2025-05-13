import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            Random random = new Random();
            int to_be_guess = random.nextInt(1, 101);

            int attempt = 0;

            while (true) {
                attempt += 1;
                System.out.print("Guess a number: ");
                int user_guess = scan.nextInt(); // could throw error

                if (to_be_guess == user_guess) {
                    System.out.printf("Congratulation! You attept %d time.\n", attempt);
                    break;
                } else {
                    if (to_be_guess > user_guess) {
                        System.out.println("Higher Number please");
                    } else {
                        if (to_be_guess < user_guess) {
                            System.out.println("Lower Number please");
                        }
                    }
                }
            }
            System.out.print("Enter 0 to Discontinue. \n>>> ");
            char isContinue = scan.next().charAt(0);
            if (isContinue != '1'){
                break;
            }
        }
        scan.close();
    }
}
