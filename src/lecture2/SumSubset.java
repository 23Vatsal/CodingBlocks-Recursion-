package lecture2;
import java.util.*;

public class SumSubset {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        String pro="";
        int target=4;
        sumsubset(pro,target);
    }
    public static void sumsubset(String pro,int target){
        if(target==0){
            System.out.println(pro);
            return;
        }
        for(int i=1;i<=target && i<=6;i++){
            sumsubset(pro+i,target-i);
        }
    }
}
