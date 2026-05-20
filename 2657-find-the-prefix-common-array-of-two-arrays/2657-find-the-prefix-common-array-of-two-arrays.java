class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        HashMap<Integer,Integer> m1=new HashMap<>();
        HashMap<Integer,Integer> m2=new HashMap<>();
        for(int i=0;i<n;i++){
           m1.put(A[i],i);
            m2.put(B[i],i);
        }
        int c[] = new int[n];
        for(int i=0;i<n;i++){
                int cnt=0;
                for(int j=0;j<=i;j++){
                    if(m1.get(A[j])<=i && m2.get(A[j])<=i)cnt++;
                }
                c[i]=cnt;
        }return c;
    }
}

// hm1 1 3 2 4
// hm2 3 1 2 4