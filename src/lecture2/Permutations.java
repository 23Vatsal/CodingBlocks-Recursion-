package lecture2;
import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        String pro="";
        String unpro="abc";
        permu(pro,unpro);
    }
    public static void permu(String pro,String unpro){
        if(unpro.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch=unpro.charAt(0);
        unpro=unpro.substring(1);
        for(int i=0;i<=pro.length();i++){
            String first=pro.substring(0,i);
            String second=pro.substring(i);
            permu(first+ch+second,unpro);
        }
    }

}
