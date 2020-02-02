package lecture1;

public class Pattern {
    public static void main(String[] args) {
        int row=4,col=0;
        pattern(row,col);
    }
    public static void pattern(int row,int col)
    {
        if(row==0)
            return;
        if(row==col)
        {
            System.out.println();
            pattern(row-1,0);
        }
        else{
            System.out.print("* ");
            pattern(row,col+1);
        }
    }
}
