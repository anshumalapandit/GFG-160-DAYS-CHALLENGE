class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=(arr.length/2);
        int j=arr.length-1;
        for(int i=0;i<n;i++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
}
}
