// brute force :
class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
          int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int XoR=0;
                for(k=start;k<=end;k++){
                    XoR=XoR^arr[k];
                
                if(XoR==k)
                count++;
            
            }
        }
}
        return count;
    }
}
// better way :
class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            int XoR=0;
            for(int j=i;j<arr.length;j++){
                XoR=XoR^arr[j];
        
            if(XoR==k)
                count++;
            
        }
        }
        return count;
    }
//optimised way:
class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
            
            if(map.containsKey(xor^k)){
                count+=map.get(xor^k);
            
        }
        if(map.containsKey(xor)){
            map.put(xor,map.get(xor)+1);
        }else{
            map.put(xor,1);
        }
        }
        return count;
    }
}
}
