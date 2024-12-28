class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        // brute force
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    int triplet=arr[i]+arr[j]+arr[k];
                    if(triplet==0){
                        List<Integer> trip=Arrays.asList(i,j,k);
                        if(!ans.contains(trip)){
                            ans.add(trip);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
