class Solution {
    public long maxMatrixSum(int[][] matrix) {
         long ans=0;
         long sum=0;
        long cnt=0;
      long minVal = Long.MAX_VALUE;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                sum+=Math.abs(matrix[i][j]);
                if(matrix[i][j]<0){
                    cnt++;
                }
                minVal=Math.min(minVal,Math.abs(matrix[i][j]));
            }
        }
        if(cnt%2==0){
            ans=sum;
        }
        else{
            ans=sum-(2*minVal);
        }
        return ans;
    }
}
// 18
// 3
// 1
// 18-2*1