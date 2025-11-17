package ex_15_String_Builder_Buffer;

public class Lab144_stringBuilder {
    public static void main(String[] args) {

        //buffer- thread safe
        //builder- not thread safe
        StringBuilder newb = new StringBuilder("Akshay");
        System.out.println(newb);

        newb.reverse();
        System.out.println(newb);
    }
}
