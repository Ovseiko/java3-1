package lib;
import java.util.regex.Pattern;

public class Main {

    public static String sort(String str){
        String[] bufstr=str.split(" ");
        for (int i=0; i<bufstr.length; i++)
            for (int j=0; j<bufstr.length-1; j++)
                if (bufstr[j].length()<bufstr[j+1].length()){
                    String a=bufstr[j];
                    bufstr[j]=bufstr[j+1];
                    bufstr[j+1]=a;
                }
        String strS="";
        for (int i=0; i<bufstr.length; i++) strS+=bufstr[i].concat(" ");
        return (strS);
    }

    public static boolean isPhone(String str){

        return Pattern.matches("\\+\\d\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}", str);
    }
    public static void main(String[] args) {
        System.out.println(sort("a bbb cccc ddd e"));
        System.out.println(sort("a bbb cc dddddd e"));
        System.out.println(isPhone("+7(123)456-78-90"));
        System.out.println(isPhone("8(123)4567890"));
    }
}

