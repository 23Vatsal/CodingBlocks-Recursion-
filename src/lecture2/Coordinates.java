package lecture2;
import java.util.*;

public class Coordinates {

    public static void main(String[] args) {
        int startx=3;
        int starty=3;
        String pro="";
        reach(pro,startx,starty);
    }
    public static void reach(String pro,int startx,int starty){

        if(startx==1 && starty==1){
            System.out.println(pro);
            return;
        }
        if(startx>1){
            reach(pro+"v",startx-1,starty);

        }
        if(starty>1){
            reach(pro+"h",startx,starty-1);

        }
    }
}
