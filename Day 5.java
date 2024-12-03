class Solution {
    void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    void nextPermutation(int[] arr) {
        // code here
        int n=arr.length;
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
            // find immediate greater of pivot
            if(pivot!=-1){
                for(int j=n-1;j>pivot;j--){
                    if(arr[j]>arr[pivot]){
                    int temp=arr[pivot];
                    arr[pivot]=arr[j];
                    arr[j]=temp;
                    break;
                    }
                }
            }
            // and then reverse(pivot+1 ,n-1);
            reverse(arr,pivot+1,arr.length-1);
        }
    }
