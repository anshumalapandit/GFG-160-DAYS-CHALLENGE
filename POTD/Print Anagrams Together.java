class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        HashMap<String ,ArrayList<String>> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            String cur=arr[i];
            char sortedArr[]=cur.toCharArray();
            Arrays.sort(sortedArr);
            cur=new String(sortedArr);
            if(map.containsKey(cur)){
                ArrayList<String> al=map.get(cur);
                al.add(arr[i]);
                map.put(cur,al);
            }else{
                ArrayList<String> al2=new ArrayList<>();
                al2.add(arr[i]);
                map.put(cur,al2);
            }
        }
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        for(String key:map.keySet()){
            ArrayList<String> value=map.get(key);
            ans.add(value);
        }
        return ans;
    }
}
