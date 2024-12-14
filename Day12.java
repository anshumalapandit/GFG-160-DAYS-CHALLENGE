class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

       int totalsum=0;
       int curMinsum=0;
       int curMaxsum=0;
       int Maxsum=arr[0];
       int Minsum=arr[0];
       
       for(int i=0;i<arr.length;i++){
           // do simple kadane to find maximum
           curMaxsum=Math.max(curMaxsum+arr[i],arr[i]);
           Maxsum=Math.max(curMaxsum,Maxsum);
           // do simple kadane to find minimum
           curMinsum=Math.min(curMinsum+arr[i],arr[i]);
           Minsum=Math.min(curMinsum,Minsum);
           // also find simulltaneouslu total sum
           totalsum+=arr[i];
       }   
          int normalsum=Maxsum;
           // corner case if totalsum==minsum if u got 0 which is not answer
          int  circularSum=totalsum-Minsum;
       
           if(Minsum==totalsum){
               return normalsum;
           }

       return Math.max(circularSum,normalsum);
    }
}
