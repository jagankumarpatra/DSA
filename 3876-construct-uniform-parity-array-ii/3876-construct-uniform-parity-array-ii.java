class Solution {
    public boolean uniformArray(int[] nums1) {
       Arrays.sort(nums1);
        return check(nums1,0) || check(nums1,1);
    }
    private boolean check(int[]a, int t){
        boolean odd=false, even=false;
        for(int x:a){
            int p=x& 1;
            if(p!=t){
                if(p==1 && t==0 && !odd){
                    // if(!odd)
                        return false;
                }
                else if(p==0 && t==1 && !odd){
                    // if(!even)
                        return false;
                }
                // if((seen>>(1-p) & 1)==0) return false;
            }
            if(p==0) even = true;
            else odd = true;
            // seen|=(1<<p);
            // if(seen==3) break;
        }
        return true;
    }
}