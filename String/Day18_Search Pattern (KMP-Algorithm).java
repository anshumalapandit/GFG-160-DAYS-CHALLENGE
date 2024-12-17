class Solution {
public  static void buildLps(int lps[],String pat){
    lps[0]=0;
    int len=0;
    int i=1;
    while(i<pat.length()){
        if(pat.charAt(i)==pat.charAt(len)){
            len++;
            lps[i]=len;
            i++;
        }else{
            if(len!=0){
                len=lps[len-1];
            }else{
                lps[i]=0;
                i++;
            }
        }
    }
}
    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        int n=txt.length();
        int m=pat.length();
        ArrayList<Integer> res=new ArrayList<>();
        int lps[]=new int[m];
        buildLps(lps,pat);
        int j=0;
        int i=0;
        while(i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
                if(j==m){
                    res.add(i-j);
                
                j=lps[j-1];
                }
            }else{
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
    return res;
    }
}
