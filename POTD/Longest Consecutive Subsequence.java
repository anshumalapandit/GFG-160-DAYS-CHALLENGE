class Solution {
    public boolean ls(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return true;
            }
        }
        return false;
    }

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        // brute force 
        int longest=1;
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            int count=1;
            while(ls(arr,x+1)==true){
                x=x+1;
                count=count+1;
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}
