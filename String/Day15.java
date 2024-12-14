class Solution {
    public String addBinary(String s1, String s2) {
        // code here
       int n=s1.length();
       int m=s2.length();
       int carry=0;
       int i=n-1;
       int j=m-1;
       StringBuilder res=new StringBuilder();
       while(i>=0 || j>=0 || carry>0){
           int cu1=i>=0? s1.charAt(i)-'0' : 0;
           int cu2=j>=0? s2.charAt(j)-'0':0;
           int add=cu1+cu2+carry;
           carry=add/2;
           res.append(add%2);
           i--;
           j--;
       }
       // convert back to string
       String finalans=res.reverse().toString();
       // remove leading zeroes;
       int k=0;
       while(k<finalans.length() && finalans.charAt(k)=='0'){
           k++;
       }
       String ans=finalans.substring(k);
    //   // what if after removing leading zeroes my ans becomes empty
    //   if(ans.isEmpty()){
    //       ans="0";
    //   }
       return ans;
    }
}
