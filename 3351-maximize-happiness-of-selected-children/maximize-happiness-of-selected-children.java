class Solution {
    public long maximumHappinessSum(int[] hap, int k) {
        long sum=0;
        int mx=0;
        Arrays.sort(hap);
        for(int i=k-1;i>=0;i--){
            mx=hap[hap.length-1-i]-i;
            if(mx>0){
                sum+=mx;
            }
        }
        return sum;
    }
}