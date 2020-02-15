package lecture3;
import javax.print.DocFlavor;
import java.util.*;
public class keypad {
    public static void main(String[] args) {
        String unpro="123";
        String pro="";
        phone(pro,unpro);

    }
    public static void phone(String pro,String unpro) {
    if(unpro.isEmpty()){
        System.out.println(pro);
        return;
    }
    int digit=unpro.charAt(0)-'0';
    unpro=unpro.substring(1);
    for(int i=(digit-1)*3;i<digit*3;i++){
        char ch=(char)('a'+i);
        phone(pro+ch,unpro);
    }

    }
}
