class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int i=a.length-1;
        int j=0;
        int n=a.length;
        int m=b.length;
        //0(n)
        while(j<m && i>=0){
            if(b[j]<a[i]){
                // swap
                int temp=b[j];
                b[j]=a[i];
                a[i]=temp;
                i--;
                j++;
            }else{
            j++;
            }
        }
        Arrays.sort(a); // 0(nlogn)
        Arrays.sort(b); // 0(mlogm)
        
    }
}
