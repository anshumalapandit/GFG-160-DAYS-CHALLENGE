lass Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }else{
                // if already contains increase count by 1
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
        }
        // add in ans list whose count greater than n/3
        for(int keys: map.keySet()){
            int count=map.get(keys);
            if(count>n/3){
                ans.add(keys);
            }
        }
        return ans;
    }
}
