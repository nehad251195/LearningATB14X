package ex_15_String_Builder_Buffer;

public class Lab147_Sbuilder_Interview  {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.reverse();
        System.out.println(sb);

        StringBuffer sbu = new StringBuffer("hello");
        sbu.insert(5, " world");
        System.out.println(sbu);

        sbu.replace(5,6,"-" );
        System.out.println(sbu);

        sbu.delete(0,1);
        System.out.println(sbu);


    }
}
