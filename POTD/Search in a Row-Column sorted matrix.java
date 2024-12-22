class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        // brute force
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==x){
                    return true;
                }
            }
        }
        return false;
    }
}
// also i can use binay search on each row so T.C =0(nLogn) but here we are not using the advantage of col wise sorted ...
// optimised 
class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        // StairCase approach 0ptimised 0(n+m)
        int row=0; 
        int col=mat[0].length-1;
        while(row<mat.length && col>=0){
            if(mat[row][col]==x){
                return true;
            }
            if(x<mat[row][col]){
                // left mai jao means col--
                col--;
            }else {
                // bottom mai jao right mai nhi jaa sakte bcoz upper se aare hai 
                row++;
            }
        }
        return false;
    }
}
