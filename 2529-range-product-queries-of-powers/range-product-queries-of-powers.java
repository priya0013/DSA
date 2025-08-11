class Solution {
    static final int mod=1000000007;
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> ls=new ArrayList<>();
         int bit = 1;
        while (bit <= n) {
            if ((n & bit) != 0) {
                ls.add(bit);
            }
            bit *= 2;
        }
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            long pro=1;
            int l=queries[i][0];
            int r=queries[i][1];
            for(int j=l;j<=r;j++){
                pro=(pro*ls.get(j))%mod;
            }
            res[i]=(int)pro;

        }
        return res;
    }
}