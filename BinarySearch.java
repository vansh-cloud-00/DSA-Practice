class Solution{
  public int[]binarySearch(int[]arr,int k){
    int low=0,high=arr.length-1;,ans=-1;
    while(low<=high){
     int mid=low+(high-low)/2;
      if(arr[mid]==k){
        int ans=k;
        high=mid-1;
      }elseif(arr[mid]<k){
        low=mid+1;
      }else{
        high=mid-1;}
    }
  }
  return ans;
}
}
