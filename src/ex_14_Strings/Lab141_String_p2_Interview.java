package ex_14_Strings;

import javax.sound.midi.Soundbank;

public class Lab141_String_p2_Interview {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        //== ->Comparison ->String => this checks the reference location
        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s2==s3);

        System.out.println(s1==s4);
        System.out.println(s3==s5);

        //equals => this check the value (Content)
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
    }
}
