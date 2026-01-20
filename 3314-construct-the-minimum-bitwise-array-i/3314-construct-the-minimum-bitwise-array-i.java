class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            int x =nums.get(i);
            int cand = -1;
             for(int j=1;j<=x;j++){
            if((j | (j+1))==x){
                cand = j;
                break;
            }
        }
        arr[i]=cand;
        }
        return arr;
    }
}