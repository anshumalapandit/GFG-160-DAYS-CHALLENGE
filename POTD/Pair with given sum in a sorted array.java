class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
}
// optimised way : 
class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                count+=map.get(complement);
            }
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        
        }
        return count;
    }
}
