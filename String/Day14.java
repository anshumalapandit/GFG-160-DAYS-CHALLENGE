class Solution {
    public int myAtoi(String s) {
        // Your code here
        int sign=1;
        int res=0;
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' '){
            // if it is leading whitespace just ignore it
            i++;
        }
        if((i<n) && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }else{
                sign=1;
            }
            i++;
        }
        // if 0 to 9 digit
        while((i<n) && (s.charAt(i)>='0' && s.charAt(i)<='9')){
            int digit=s.charAt(i)-'0'; // u will get digit from 0 to 9
            
            if(res>(Integer.MAX_VALUE-digit)/10){
                return sign==1 ? Integer.MAX_VALUE: Integer.MIN_VALUE;
            }
            res=10*res+digit;
                i++;
            }
            return res*sign;
        }
    }
