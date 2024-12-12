class solution {
  public static int maxsum(int arr[]){
    int cursum=arr[0];
    int maxsum=arr[0];
    for(int i=1;i<arr.length;i++){
      if(cursum>0){
        cursum+=arr[i];
      }
      cursum=arr[i];
      if(cursum>maxsum){
        maxsum=cursum;
      }
    }
      return maxsum;
    }
  }
