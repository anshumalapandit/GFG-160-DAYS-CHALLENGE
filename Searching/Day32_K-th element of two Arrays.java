class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int merge[]=new int[a.length+b.length];
        // brute force 0(2n)
        int i=0,j=0,kth=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                merge[kth]=a[i];
                i++;
            }else{
            merge[kth]=b[j];
            j++;
        }
        kth++;
    }
    while(i<a.length){
        merge[kth]=a[i];
        i++; kth++;
    }
    while(j<b.length){
        merge[kth]=b[j];
        j++; kth++;
    }
    return merge[k-1];
}
}
