import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "adana 1. lige çıktı";
        List<String> sonuc=methodMake(text);

        for (String a:sonuc
             ) {
            System.out.print(a);
        }
    }
    public static List<String> methodMake(String text) {
        String reverse="";
        char ch;

        List<String> cumle=new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)!=' ') {
                ch = text.charAt(i);
                reverse = ch + reverse;
            }
            else {
                cumle.add(reverse+" ");
                reverse ="";
            }
        }
        cumle.add(reverse);
        return cumle;
}
}