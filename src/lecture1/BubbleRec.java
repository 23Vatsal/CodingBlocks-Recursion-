package lecture1;

public class BubbleRec {
    public static void main(String[] args) {
        int a[]={1,5,2,4,7,9};
        int i=0,j=0;
        bubble(a,i,j);
        for(int k=0;k<a.length;k++)
            System.out.println(a[k]);
    }
    public static int[] bubble(int[] a, int i, int j)
    {
        int temp;
    if(i==a.length-1){
    return a;
    }
        if(j==a.length-1)
            return  bubble(a,i+1,0);
    if(a[j]>a[j+1]){
    temp=a[j];
    a[j]=a[j+1];
    a[j+1]=temp;
    }


        return bubble(a,i,j+1);
    }
}
