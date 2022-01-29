import java.util.*;

public class DuplicateNum {

    public static int DuplicateNumber(int arr[])
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr[i+1])
            {
                return arr[i];
            }
        }
        return -1;
    }

    public static int DuplicateNumber_Pro(int arr[])
    {
        int count[]=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }

        for(int i=0;i<count.length;i++)
        {
            if(count[i]>1)
            {
                return i;
            }
        }
        return -1;
    }

    public static int DuplicateNum_Efficient(int num[])
    {
        int slow=num[0];
        int fast=num[0];

        do {
            slow=num[slow];
            fast=num[num[fast]];
        } while (slow!=fast);

        fast=num[0];
        while(slow!=fast)
        {
            slow=num[slow];
            fast=num[fast];
        }
        return fast;
    }

  public static void main(String[] args) 
  {
      int arr[]={1,3,4,2,3,5};
      System.out.println(DuplicateNumber(arr));
      System.out.println(DuplicateNumber_Pro(arr));
      System.out.println(DuplicateNum_Efficient(arr));
  }
}
