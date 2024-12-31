class Solution {

    public int peakElement(int[] arr) {
        // code here
        int first=Integer.MIN_VALUE;
        int last=Integer.MIN_VALUE;
        int ans=0;
        if(arr.length==1){
            return 0;
        }
        
        for(int i=0;i<arr.length;i++){
            int cur=arr[i];
            if(i==0){
                if(cur>first && cur>arr[i+1]){
                    ans=i;
                }
            }else if(i==arr.length-1){
                if(cur>last && cur>arr[i-1]){
                    ans=i;
                }
            }else{
                if(cur>arr[i-1] && cur>arr[i+1]){
                    ans=i;
                }
            }
        }
        return ans;
    }
    //optimised way : 0(logn) leetcode question
    class Solution {
    public int findPeakElement(int[] nums){
        int n=nums.length;
        if(n==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                return mid;
            }else if(nums[mid]>nums[mid-1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
}
