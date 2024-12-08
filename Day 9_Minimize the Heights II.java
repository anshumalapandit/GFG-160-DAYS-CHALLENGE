class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
         Arrays.sort(arr);
        int res=arr[n-1]-arr[0];
       
        for(int i=1;i<arr.length;i++){
            if(arr[i]-k<0){
                continue;
            }
            int MinH=Math.min(arr[0]+k,arr[i]-k);
            int MaxH=Math.max(arr[i-1]+k,arr[n-1]-k);
            res=Math.min(res,MaxH-MinH);
        }
        return res;
    }
}
