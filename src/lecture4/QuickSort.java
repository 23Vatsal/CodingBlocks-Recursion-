package lecture4;
import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
       int a[]={1,4,6,7,5};
       int start=0;
       int end=a.length;
       quickSort(a,start,end);
        System.out.println(Arrays.toString(a));

    }
    public static void quickSort(int a[],int start,int end){
        if(start>=end)
            return;
        int pivot=end-1;
        pivot=pivotChange(a,start,pivot);
        quickSort(a,start,pivot);
        quickSort(a,pivot+1,end);

    }
    public static int pivotChange(int a[],int start,int pivot){
        int j=start;
        for (int i = start; i <pivot ; i++) {
            if(a[i]<a[pivot]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        int temp=a[pivot];
        a[pivot]=a[j];
        a[j]=temp;
        return j;
    }
}
