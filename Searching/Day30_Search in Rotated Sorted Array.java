class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                // its means left part is sorted
                if(arr[start]<=key && key<arr[mid]){
                    end=mid-1; // keys lies in left
                }else{
                    start=mid+1; // right side
                }
            }else{
                if(arr[end]>=key && key>arr[mid]){
                    start=mid+1; // lies in right side
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
