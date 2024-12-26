// brute force will give u tle error 
class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length;j++){
               if(i!=j && arr[i]+arr[j]==target){
                    return true;
               }
           }
               
            }
        return false;
    }
}
// optimsed approach 0(nlogn)
// remembet two pointer approach requires sorted array for finding target sum
class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target && i!=j){
                return true;
            }else if(arr[i]+arr[j]<target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
