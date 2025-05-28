package logicalQuestions;

import java.util.Scanner;

public class RandomNumberGame {

    boolean status = true;

    public int generateRandomNumber() {
        double no = Math.random() * 100;
        return (int) no;
    }

    public void guessNumber() {
        int actual_no = generateRandomNumber();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Guess the number: ");
            int no = scanner.nextInt();

            if (no == actual_no) {
                System.out.println("Wow, your guess is accurate...!!");
                status = false;
            } else {
                if (no < actual_no) {
                    System.out.println("Too low");
                }
                if (no > actual_no) {
                    System.out.println("Too high");
                }
            }
        } while (status);

        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println("===== Welcome to Guess the Number Game =====");

        RandomNumberGame obj = new RandomNumberGame();
        obj.guessNumber();
    }
}
