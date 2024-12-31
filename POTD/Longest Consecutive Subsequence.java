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
// better approach 0(nlogn)
class Solution {
    

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        // better force 
        Arrays.sort(arr);
        int longest=1;
        int lastsmallest=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-1==lastsmallest){
                count++;
                lastsmallest=arr[i];
            }else if(lastsmallest!=arr[i]){
               
                 count=1;
                 lastsmallest=arr[i];
            }
            longest=Math.max(count,longest);
        }
        return longest;
    }
}
