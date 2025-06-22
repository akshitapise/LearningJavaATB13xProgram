package JavaPrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);
        int fact = 1;
        if (!sc.hasNextInt()) {
            System.out.println("Enter integer only ");
        }

        int num = sc.nextInt();
        if (num < 0)
            System.out.println("Negative digits not allowed");
        else if (num == 0) {
            System.out.println("Factorial is " + fact);
        } else {
            for (int i = 1; i <= num; i++)
                fact = i * fact;

            System.out.println("Factorial is " + fact);
        }
    }
}




