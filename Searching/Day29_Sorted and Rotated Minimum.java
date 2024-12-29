class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        // brute force
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
