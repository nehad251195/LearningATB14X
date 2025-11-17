package ex_14_Strings;

import java.util.Scanner;

public class Lab149_String_reverse_Palindrome_withoutFunction {
    public static void main(String[] args) {
        //WAP to reverse string without using inbuild function
        Scanner text = new Scanner(System.in);
        System.out.println("enter word to be reversed");
        String name = text.next();
        String reverse="";
        for(int i=name.length()-1;i>=0;i--)
        {
            reverse = reverse + name.charAt(i);
        }

        System.out.println(reverse);
        if (name.equals(reverse))
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }
}
