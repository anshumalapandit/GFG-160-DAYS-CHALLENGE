class Solution {
    public static void buildLps(int lps[],String pat){
        lps[0]=0;
        int i=1;
        int len=0; // coz no proper prefix for starting char
        while(i<pat.length()){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    // no pattern found
                    lps[i]=0;
                    i++;
                }
            }
        }
    }
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.length()!=s2.length()){
            return false;
        }
        String txt=s1+s1;
        String pat=s2;
        int lps[]=new int[pat.length()];
        buildLps(lps,pat);
        int i=0;
        int j=0;
        int n=txt.length();
        while(i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            
            if(j==pat.length()){
                // it means entire pattern matched
                return true;
            }
        }else{
            if(j!=0){
                j=lps[j-1]; // again move j to backward
            }else{
                i++;
            }
        }
        
    }
    return false;
    }
}
