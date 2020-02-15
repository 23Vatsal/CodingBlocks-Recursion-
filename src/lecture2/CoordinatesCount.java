
package lecture2;
import java.util.*;

public class CoordinatesCount {

    public static void main(String[] args) {
        int startx=3;
        int starty=3;
        String pro="";
        ArrayList<Integer> list=new ArrayList<>();
        reach(pro,startx,starty,list);
        System.out.println(list.get(list.size()-1));


    }
    public static int reach(String pro,int startx,int starty,ArrayList<Integer> list){

        if(startx==1 && starty==1){
            //System.out.println(count);
            return 1;

        }
        int count=0;
        if(startx>1){
            count+=reach(pro+"v",startx-1,starty,list);

        }
        if(starty>1){
           count+= reach(pro+"h",startx,starty-1,list);

        }
        list.add(count);
        return count;

    }
}
