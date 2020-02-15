package lecture3;
import java.util.*;
public class FreqArray {
    public static void main(String[] args) {
        int farray[]=new int[26];
        String str="aaabcc";
        freq(str,farray);
    }
    public static int[] freq(String str,int farray[]) {

     for(int i=0;i<str.length();i++){
         char ch=str.charAt(i);
         farray[ch-'a']++;
     }
     return farray;
     }

        }

