package JavaPrograms;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        // Scanner class is used to take input from console
        // create scanner class object
        String name;
        int age;
        System.out.println("Enter user name");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();  //nexLine()
        System.out.println("Enter user age");
        age = sc.nextInt();   //nextInt();
        System.out.println(name + "  " + age);
    }
}
