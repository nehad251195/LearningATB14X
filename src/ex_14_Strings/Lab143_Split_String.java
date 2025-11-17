package ex_14_Strings;

public class Lab143_Split_String {
    public static void main(String[] args) {
        String xx= "Neha-Akshay-Poojari-Dorugade";
        String[] namearr= xx.split("-");
        for (String nz : namearr){
            System.out.println(nz);
        }
    }
}
