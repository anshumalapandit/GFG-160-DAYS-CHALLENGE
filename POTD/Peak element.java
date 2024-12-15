class Solution {

    public int peakElement(int[] arr) {
        // code here
        int first=Integer.MIN_VALUE;
        int last=Integer.MIN_VALUE;
        int ans=0;
        if(arr.length==1){
            return 0;
        }
        
        for(int i=0;i<arr.length;i++){
            int cur=arr[i];
            if(i==0){
                if(cur>first && cur>arr[i+1]){
                    ans=i;
                }
            }else if(i==arr.length-1){
                if(cur>last && cur>arr[i-1]){
                    ans=i;
                }
            }else{
                if(cur>arr[i-1] && cur>arr[i+1]){
                    ans=i;
                }
            }
        }
        return ans;
    }
}
