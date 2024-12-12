class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int cursum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<arr.length;i++){
           if(cursum>=0){
               cursum+=arr[i];
           }else{
               cursum=arr[i];
           }
           if(cursum>maxsum){
               maxsum=cursum;
           }
        }
        return maxsum;
    }
}
