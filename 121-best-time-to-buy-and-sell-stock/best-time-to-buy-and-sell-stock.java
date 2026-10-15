class Solution {
    public int maxProfit(int[] prices) {
        int mn=Integer.MAX_VALUE;
        int mx=0;
        for(int i=0;i<prices.length;i++){
            mn=Math.min(mn,prices[i]);
            int pro=prices[i]-mn;
            mx=Math.max(pro,mx);
        }
        return mx;
    }
}