class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int left=0;
        int right=mat[0].length-1;
        int top=0;
        int bottom=mat.length-1;
        while(left<=right && top<=bottom){
            //left to right row same
            for(int col=left;col<=right;col++){
                ans.add(mat[top][col]);
            }
            top++;
            // top to bottom - col same
            for(int row=top;row<=bottom;row++){
                ans.add(mat[row][right]);
            }
            right--;
            //right to left
            if(top<=bottom){
            for(int col=right;col>=left;col--){
                ans.add(mat[bottom][col]);
            }
            bottom--;
            }
            // bottom to top
            if(left<=right){
            for(int row=bottom;row>=top;row--){
                ans.add(mat[row][left]);
            }
            
            left++;
            }
            }
             return ans;
        }
}

