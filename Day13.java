class Solution {
    // Function to find the smallest positive number missing from the array.

    public int missingNumber(int[] arr) {
        // Your code here
       int n=arr.length;
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                map.put(arr[i],true);
            }
        }
        // find smallest positive missing
        for(int i=1;i<=arr.length;i++){
            if(map.containsKey(i) ){
                continue;
            }else{
                // if do not contain
                return i;
            }
        }
        // If all numbers are in their correct positions, return n + 1
        return n+1;

    }
}
