class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;
       int zero=0,one=0,two=0;
       for(int i=0;i<n;i++){
        if(nums[i]==0){
            zero++;
        }
        else if(nums[i]==1){
            one++;
        }
        else{
            two++;
        }
       }
       int j=0;
       while(zero>0){
        nums[j++]=0;
        zero--;
       }
       while(one>0){
        nums[j++]=1;
        one--;
       }
       while(two>0){
        nums[j++]=2;
        two--;
       }
    }
}