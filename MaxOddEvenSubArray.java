public class MaxOddEvenSubArray {
    public static int Count_MaxEvenOddSubArray(int arr[],int n)
    {
        int res=1;
        int curr=1;

        for(int i=1;i<n;i++)
        {
            if(((arr[i]%2!=0)&&(arr[i-1]%2!=0))||((arr[i]%2==0)&&(arr[i-1]%2==0)))
            {
                curr++;
                res=Math.max(curr, res);
            }
            else 
            {
               
                curr=1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={12 ,22, 33, 43, 53, 62, 71, 83};
        int n=arr.length;
        System.out.println(Count_MaxEvenOddSubArray(arr, n));        
    }
}
