class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        // return whose freq 1
        for(int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            if(map.containsKey(cur)){
                int freq=map.get(cur);
                if(freq==1){
                    return cur;
                }
            }
        }
        return '$';
    }
}
