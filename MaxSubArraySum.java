public class MaxSubArraySum {
    public static int Max_Sum(int arr[],int n)
    {
        int max_sum=arr[0];
        int max_ending=arr[0];

        for(int i=1;i<n;i++)
        {
            max_ending=Math.max(max_ending+arr[i], arr[i]);
            max_sum=Math.max(max_sum, max_ending);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,3,-4,5,-6};
        System.out.println(Max_Sum(arr, arr.length));
    }
}
