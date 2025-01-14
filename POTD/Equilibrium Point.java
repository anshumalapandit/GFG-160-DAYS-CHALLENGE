// brute force:
class Solution {
    public static int rightSum(int start,int end,int arr[]){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum+=arr[i];
        }
        return sum;
    }
    // Function to find equilibrium point in the array.
    public static int findEquilibrium (int arr[]) {
        // code here
        int n=arr.length-1;
        int leftsum=arr[0];
        for(int i=1;i<=n;i++){
            // calculate right sum
            int RS=rightSum(i+1,n,arr);
            if(leftsum==RS){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
}
optimised way :
class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int prefixSum[]=new int[arr.length];
        prefixSum[0]=arr[0];
        int totalSum=arr[0];
        // lets calculate totalSum and prefixSum
        for(int i=1;i<arr.length;i++){
            totalSum+=arr[i];
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        // now compare
        for(int i=0;i<arr.length;i++){
            int leftSum=i==0? 0 :prefixSum[i-1];
            int rightSum=totalSum-prefixSum[i];
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }
}
