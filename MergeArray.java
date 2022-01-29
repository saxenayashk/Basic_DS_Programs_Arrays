import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MergeArray {

    public static void Naive(int arr[],int n)
    {
        

        for (int i = 0; i < n; i++) {
            boolean flag=false;
            for (int j = i+1; j < n; j++) {
                if(arr[i]<=arr[j])
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    public static void Efficient(int arr[],int n)
    {
        int curr_val=arr[n-1];
        ArrayList<Integer> al=new ArrayList<>();
        al.add(curr_val);

        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>curr_val)
            {
                curr_val=arr[i];
                al.add(curr_val);
            }
        }

        Collections.sort(al,Collections.reverseOrder());

        for(int x:al)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
      int arr[]={7,10,4,10,6,5,2};
      int n=arr.length;
      
      Naive(arr, n);
      Efficient(arr, n);
    }
}
