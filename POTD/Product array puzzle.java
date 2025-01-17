// brute force
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int ans[]=new int[arr.length];
        int ps
        for(int i=0;i<arr.length;i++){
            int prod=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    prod*=arr[j];
                }
            }
            ans[i]=prod;
        }
        return ans;
    }
}
// optimised approach:
// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int ans[]=new int[arr.length];
       int ps[]=new int[arr.length];
       int ss[]=new int[arr.length];
       ps[0]=1;
       for(int i=1;i<arr.length;i++){
           ps[i]=ps[i-1]*arr[i-1];
       }
       ss[arr.length-1]=1;
       for(int i=arr.length-2;i>=0;i--){
           ss[i]=ss[i+1]*arr[i+1];
       }
       // coressponding elem ko multiply
       for(int i=0;i<arr.length;i++){
           ans[i]=ps[i]*ss[i];
       }
        return ans;
    }
}
