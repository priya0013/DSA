class Solution {
    public int maximumWealth(int[][] accounts) {
        int mx=0;
        for(int i=0;i<accounts.length;i++){
            int cum=0;
            for(int j=0;j<accounts[i].length;j++){
                cum+=accounts[i][j];
            }
            mx=Math.max(cum,mx);
        }
        return mx;
    }
}