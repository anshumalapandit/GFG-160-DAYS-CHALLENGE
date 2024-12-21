class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        int n=citations.length;
        int freq[]=new int[n+1];
        for(int i=0;i<n;i++){
            int cur=citations[i];
            if(cur>=n){
                // store at last index of freq
                freq[n]++;
            }else{
                freq[cur]++;
            }
        }
        int count=0;
        for(int i=n;i>=0;i--){
            count+=freq[i];
            if(count>=i){
                return i;
            }
        }
        return 0;
    }
}
