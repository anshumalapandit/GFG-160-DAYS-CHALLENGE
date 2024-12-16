class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i=0;
        int j=0;
      //  int s=0;
        int count=0;
        int n=a.length, m=b.length;
      //  int merge[]=new int[n+m];
        while(i<n && j<m){
            if(a[i]<b[j]){
               // merge[s]=a[i];
               count++;
               if(count==k) return a[i];
                i++;
            }else if(a[i]>b[j]){
              //  merge[s]=b[j];
              count++;
              if(count==k) return b[j];
                j++;
            }
           // s++;
        }
        // now add remaining element into it
        while(i<n){
            count++;
            if(count==k) return a[i];
            i++;
        }
        while(j<m){
         //   merge[s]=b[j];
         count++;
         if(count==k) return b[j];
            j++;
        }
        return -1;
        
    }
}
