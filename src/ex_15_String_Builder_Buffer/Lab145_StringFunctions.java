package ex_15_String_Builder_Buffer;

public class Lab145_StringFunctions {
    public static void main(String[] args) {

        String name="neha";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
     //   System.out.println(name.charAt(6)); -> java.lang.StringIndexOutOfBound

        System.out.println(name.concat("Poojari"));

        System.out.println(name.contains("oo"));

        System.out.println(name.equals("neha"));

        System.out.println(name.equalsIgnoreCase("NEHA"));


        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('n'));

        String vv="ne   ";
        System.out.println(vv.trim());

        System.out.println(name.compareTo("neha"));

    }
}
