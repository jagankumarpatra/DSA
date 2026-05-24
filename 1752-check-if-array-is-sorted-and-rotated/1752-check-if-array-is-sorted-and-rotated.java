class Solution {
    public boolean check(int[] arr) {
        int count=0;
        int n=arr.length;
     for(int i=1;i<arr.length;i++){
         if(arr[i-1]>arr[i])
            count++;
     }
     if(arr[n-1]>arr[0])
        count++;
     return count<=1;
        
    }
}
