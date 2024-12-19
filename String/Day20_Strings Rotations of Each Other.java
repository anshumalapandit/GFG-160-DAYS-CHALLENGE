// brute force => 0(n2) 1. concatenating = 0(n) which is very heavy and inefficient way also it will give tle error
class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.length()!=s2.length()){
            return false;
        }
        int n=s1.length();
    
        for(int i=0;i<n;i++){
        s1=s1.charAt(n-1)+s1.substring(0,n-1); // 0(n)
        if(s1.equals(s2)){ //0(n)
            return true;
        }
        }
        return false;
    }
}
Step-by-Step Explanation:
s1.charAt(n - 1):

Extracts the last character of s1.
Returns a char.
s1.substring(0, n - 1):

Extracts a substring from the start of s1 to the second-to-last character.
Creates a new String object in memory.
Concatenation (+):

Combines the char and the String created by substring to form a new string.
This operation creates yet another new String object.
Assignment (s1 = ...):

The s1 variable now points to this newly created String object, while the old s1 object remains in memory until garbage collection occurs.


