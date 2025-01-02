// Brute force 0(n2)
class Solution {
    public int countSubarrays(int arr[], int sum) {
        // code here
        // brute force= i will find all sum of subarray if sum==k 
        int count=0;
        for(int i=0;i<arr.length;i++){
           int curSum=0;
            for(int j=i;j<arr.length;j++){
               curSum+=arr[j];
                if(curSum==sum){
                    count++;
                }
            }
        }
        return count;
    }
}
// User function Template for Java
class Solution {
    public int countSubarrays(int arr[], int sum) {
        // code here
        //optimised way
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int curSum=0;
        for(int i=0;i<arr.length;i++){
            curSum+=arr[i];
            if(map.containsKey(curSum-sum)){
                count+=map.get(curSum-sum);
            }
                map.put(curSum,map.getOrDefault(curSum,0)+1);
    
        }
        return count;
    }
}
