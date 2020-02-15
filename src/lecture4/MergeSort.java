package lecture4;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int a[]={8,7,6,5,4,3,2,1};
        divide(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void divide(int a[],int start,int end){
        if(start<end) {
            int mid = (start + end) / 2;
            divide(a,start,mid);
            divide(a,mid+1,end);
             merge(a,start,mid,end);
        }

    }
    public static void merge(int a[],int start,int mid,int end){
        int l = mid - start + 1;
        int r = end - mid;

        int LeftArray[] = new int [l];
        int RightArray[] = new int [r];

        for (int i=0; i<l; ++i)
            LeftArray[i] = a[start + i];

        for (int j=0; j<r; ++j)
            RightArray[j] = a[mid + 1+ j];


        int i = 0, j = 0;
        int k = start;
        while (i<l&&j<r)
        {
            if (LeftArray[i] <= RightArray[j])
            {
                a[k] = LeftArray[i];
                i++;
            }
            else
            {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<l)
        {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<r)
        {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }


}

