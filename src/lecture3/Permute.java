//prints the permutations in lexicographical order.
package lecture3;
import java.util.*;
public class Permute {
    public static void main(String[] args) {
        String str="abc";
        String pro="";
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
        }
        int len=str.length();
        permute(pro,freq,len);
    }
    public static void permute(String pro,int freq[],int len){
        if(len==0){
            System.out.println(pro);
            return;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                freq[i]--;
                permute(pro+(char)('a'+i),freq,len-1);
                freq[i]++;
            }
        }
    }
}
