// brute force:
class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int curprod=1;
        int maxprod=1;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=0;j<arr.length;j++){
                int end=j;
                curprod=1;
                for(int k=start;k<=end;k++){
                    curprod*=arr[k];
                }
                if(maxprod<curprod){
                    maxprod=curprod;
                }
            }
        }
        return maxprod;
    }
}
// approach 2: 
class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int curmin=arr[0];
        int curmax=arr[0];
        int maxprod=arr[0];
        for(int i=1;i<arr.length;i++){
           int temp =Math.max(arr[i],Math.max(arr[i]*curmin,arr[i]*curmax));
            curmin=Math.min(arr[i],Math.min(arr[i]*curmin,arr[i]*curmax));
            curmax=temp;
            maxprod=Math.max(maxprod,curmax);
        }
        return maxprod;
    }
}
// Traversing in both direction :
class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
       int leftToRight=1;
       int rightToLeft=1;
       int maxprod=Integer.MIN_VALUE;
       int n=arr.length;
       for(int i=0;i<n;i++){
           if(leftToRight==0){
               leftToRight=1;
           }
           if(rightToLeft==0){
               rightToLeft=1;
           }
           leftToRight*=arr[i];
           int j=n-i-1;
           rightToLeft*=arr[j];
           maxprod=Math.max(maxprod,Math.max(leftToRight,rightToLeft));
       }
        return maxprod;
    }
}
