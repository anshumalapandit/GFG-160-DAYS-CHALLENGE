class Solution {
    public static String reverse(String s){
     StringBuilder reversed = new StringBuilder(s);
    return reversed.reverse().toString();
    }
    public static void buildLps(int lps[],String rev){
        lps[0]=0;
        int i=1;
        int len=0; // length of lps[0] is 0
        while(i<rev.length()){
            if(rev.charAt(i)==rev.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                // if there is mismatch
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
    }
    public static int minChar(String s) {
        // Write your code her
        String r=reverse(s);
       String rev=s+"$"+r;
        int lps[]=new int[rev.length()];
        buildLps(lps,rev);
        return s.length()-lps[rev.length()-1];
    }
}
