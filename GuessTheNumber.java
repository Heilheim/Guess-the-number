import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int number = new Random().nextInt(10);
        System.out.println("Guess the number from 0 to 9");
        while (true) {
            int userCase = new Scanner(System.in).nextInt();

            if (number > userCase) {
                System.out.println("number > " + userCase + ". Try again:");
            } else if (number < userCase) {
                System.out.println("number < " + userCase + ". Try again:");
            } else {
                System.out.println("Congratulations, you guessed the number!");
                break;
            }
        }
    }
}

