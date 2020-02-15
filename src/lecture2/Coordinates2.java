package lecture2;
import java.util.*;

public class Coordinates2 {

    public static void main(String[] args) {
        int startx=3;
        int starty=3;
        String proc="";
        reach(proc,startx,starty);

    }
    public static ArrayList reach(String proc,int startx,int starty){
        ArrayList<String> list=new ArrayList<>();

        if(startx==1 && starty==1) {
            list.add(proc);
            System.out.println(list);
            return list;

        }
        if(startx>1){
            list.addAll(reach(proc+"v",startx-1,starty));
        }
        if(starty>1){
            list.addAll(reach(proc +"h",startx,starty-1));
        }
        return list;
    }
}
