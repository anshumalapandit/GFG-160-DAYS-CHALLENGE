class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        // brute force
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    int triplet=arr[i]+arr[j]+arr[k];
                    if(triplet==0){
                        List<Integer> trip=Arrays.asList(i,j,k);
                        if(!ans.contains(trip)){
                            ans.add(trip);
                        }
                    }
                }
            }
        }
        return ans;
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
