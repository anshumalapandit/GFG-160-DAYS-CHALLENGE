class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
       int i=0;
       int j=0;
       int k=arr.length-1;
       while(i<=k){
           int cur=arr[i];
           if(cur==0){
               // swap i and j
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j++;
           }else if(cur==1){
               // j to i-1 tak 1 ka region
               i++;
           }else{
               // swap i and k
               int temp=arr[i];
               arr[i]=arr[k];
               arr[k]=temp;
               k--;
           }
       }
    }
}
