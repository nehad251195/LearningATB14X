package ex_14_Strings;

public class Lab140_String_P1_Interview {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3="Hello";
        //Above all are considered as 1 string only, as all values are same & will point
        // at one location only.

        String s4="hello";
        //this is the 2nd string as the value differs.

        String s5=new String("Hello"); //3rd
        String s6=new String("Hello"); //4th string as new keyword always creates new object.



    }
}
