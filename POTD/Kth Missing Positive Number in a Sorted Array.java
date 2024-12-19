class Solution {
    public int kthMissing(int[] arr, int k) {
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        // code here
        int missingcount=0;
        int current=1;
        while(true){
            if(!s.contains(current)){
                missingcount++;
                if(missingcount==k){
                    return current;
                }
            }
            current++;
        }
    }
}
