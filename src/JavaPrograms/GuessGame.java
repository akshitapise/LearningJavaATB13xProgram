package JavaPrograms;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; //0 to 100

        int attempts = 0;
        int enteredNumber;

        System.out.println("\n Lets call number to Guess as Master number");

        while (true) {
            System.out.println("\n Enter number");

            Scanner sc = new Scanner(System.in);
            enteredNumber = sc.nextInt();
            attempts++;
            System.out.println("No. of attempt" + attempts);
            if (enteredNumber < numberToGuess)
                System.out.println("Guessed number Lesser than Master Number");
            else if (enteredNumber > numberToGuess)
                System.out.println("Guessed number Bigger than Master Number");
            if (enteredNumber == numberToGuess) {
                System.out.println("\n Correct Guess");
                break;
            }


        }


    }

}
