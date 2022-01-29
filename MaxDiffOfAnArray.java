public class MaxDiffOfAnArray {
    public static int efficient(int arr[],int n)
    {
        int res= arr[1]-arr[0];
        int minDiff=arr[0];

        for(int j=1;j<n;j++)
        {
            res=Math.max(res, arr[j]-minDiff);
            minDiff=Math.min(arr[j], minDiff);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,3,10,6,4,8,1};
        int n=arr.length;

        System.out.println(efficient(arr, n));
    }
}
