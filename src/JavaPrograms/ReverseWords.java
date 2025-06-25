package JavaPrograms;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String temp = " ";
        String[] words = input.split(" ");
       // System.out.println(words.length);
       for (int i = words.length-1; i>=0;i--)
        {
             temp = temp + words[i];
             if((i!=0))
             {
                 temp = temp + " " ;
             }
        }

        System.out.println(temp);

    }
}
