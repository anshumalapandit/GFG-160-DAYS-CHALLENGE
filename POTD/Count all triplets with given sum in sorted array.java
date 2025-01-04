// brute force"
class Solution{
  public int countTriplets(int[] arr, int target) {
        // Code Here
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=0;k<arr.length;k++){
                    if(i<j && j<k && i<k){
                        int sum=arr[i]+arr[j]+arr[k];
                        if(sum==target){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
// optimised its is given that array is sorted then take its benefits use two pointer approach
class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int count=0;
        int n=arr.length;
        
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==target){
                    count++;
                   // Check all possible duplicates for the same target sum
                    int tempLow = left+ 1;
                    int tempHigh = right - 1;

                    while (tempLow < right && arr[tempLow] == arr[left]) {
                        count++;
                        tempLow++;
                    }
                    while (tempHigh > left && arr[tempHigh] == arr[right]) {
                        count++;
                        tempHigh--;
                    }

                    // Move pointers inward
                    left++;
                    right--;
                }
                else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return count;
    }
}
