package ex_14_Strings;

import javax.sound.midi.Soundbank;

public class Lab142_String_CharSeq
{
    public static void main(String[] args) {

        String name="Akshay";
        String n1=name.substring(2,6);
        System.out.println(n1);

        CharSequence n = name.subSequence(2,6);
        System.out.println(n);

        char[] arr = name.toCharArray();
        System.out.println(arr);

        String neha = "Neha Dorugade ";
        System.out.println(neha);
        System.out.println(neha.trim());

        String nn= String.join(" ","neha","poojari" );
        System.out.println(nn);
        System.out.println("-----------------------");
        String xx= "Neha-Akshay-Poojari-Dorugade";
        String[] namearr= xx.split("-");
        for (String nz : namearr){
            System.out.println(nz);
    }}
}
