public class Sort012 {

    public static void Naive(int num[])
    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]>num[j])
                {
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
    }

    public static void Efficient(int num[])
    {
        int low=0;
        int mid=0;
        int high=num.length-1;

        while(mid<=high)
        {
             if(num[mid]==0)
             {
                 int temp=num[low];
                 num[low]=num[mid];
                 num[mid]=temp;

                 low++;
                 mid++;
             }
             else if(num[mid]==1)
             {
                 mid++;
             }
             else if(num[mid]==2)
             {
                 int temp=num[mid];
                 num[mid]=num[high];
                 num[high]=temp;

                 mid++;
                 high--;
             }
        }
    }

    public static void print(int num[])
    {
        for(int ele:num)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,0,0,2,1,0,1,1,2,2,2,1,0};
        Efficient(arr);
        print(arr);        
    }
}
