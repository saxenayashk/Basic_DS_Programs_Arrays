public class MaxConsecutiveOnes
{
    public static int Max_Count(int arr[])
    {
        int res=0;
        int curr=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1)
            {
                curr++;
            }
            else 
            {
                res=Math.max(curr, res);
                curr=0;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,0,1,1,1,0,1};
        int n=arr.length;
        System.out.println(Max_Count(arr));               
    }
}