class Solution {
    public boolean bs(int row[],int x){
        int start=0;
        int end=row.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(row[mid]==x){
                return true;
            }
            if(x<row[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return false;
    }

    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        // call bs for each row
        for(int i=0;i<mat.length;i++){
            if(bs(mat[i],x)){
                return true;
            }
        }
        return false;
    }
}
