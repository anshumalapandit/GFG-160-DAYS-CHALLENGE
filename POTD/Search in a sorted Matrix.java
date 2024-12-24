class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        // will use stiarcase approach
        int row=0;
        int col=mat[0].length-1;
        while(row<mat.length && col>=0){
        if(x==mat[row][col]){
            return true;
        }
        if(x<mat[row][col]){
            // row will remain same col change
            col--;
            
        }else{
            // bottom mai jao col remain same row change
            row++;
        }
    }
    return false;
    }
}
