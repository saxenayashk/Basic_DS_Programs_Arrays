public class MajorityElement {

    public static int Naive(int arr[],int n)
    {
        int count=1;
        for(int i=0;i<n-1;i++)
        {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>n/2)
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static int Efficient(int arr[],int n)
    {
        int res=0;
        int count=1;
        for (int i = 1; i < n; i++) {
            if(arr[res]==arr[i])
            {
                count++;
            }
            else 
            {
                count--;
            }
            if(count==0)
            {
                res=i;
                count=1;
            }
        }
        count=0;

        for (int i = 0; i < n; i++) {
            if(arr[res]==arr[i])
            {
                count++;
            }
        }
        if(count<=n/2)
        {
            return arr[res];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,6,6,6,6,6,6};
        int n=arr.length;

        System.out.println(Naive(arr, n));
        System.out.println(Efficient(arr, n));
    }
}
