package lecture2;
import java.util.*;

public class Subseq {
    public static void main(String[] args) {
        String unprocessed="abc";
        String processed="";
        subseqRec(processed,unprocessed);
    }
    public static void subseqRec(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        subseqRec(processed+ch,unprocessed);
        subseqRec(processed, unprocessed);
    }
}
