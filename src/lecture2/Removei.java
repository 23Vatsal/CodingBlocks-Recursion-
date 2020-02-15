package lecture2;
import java.util.*;

public class Removei {
    public static void main(String[] args) {
        String unpro="String";
        String pro="";
        removei(pro,unpro);
    }
    public static void removei(String pro,String unpro){
        if(unpro.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch=unpro.charAt(0);

        if(ch=='i' || ch=='I'){
            pro=pro;
        }
        else{
            pro=pro+ch;
        }
        unpro=unpro.substring(1);
        removei(pro,unpro);
    }
}
