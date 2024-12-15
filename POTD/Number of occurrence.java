class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        // now retrive freq of target
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                int freq=map.get(target);
                return freq;
            }
        }
        return 0;
    }
}
