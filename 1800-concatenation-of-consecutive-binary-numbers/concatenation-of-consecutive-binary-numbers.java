class Solution {
    static final int  mod=1_000_000_007;

    public int concatenatedBinary(int n) {
        long ans=0;
        int bit=0;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0){
                bit++;
            }
            ans=((ans<<bit)|i)%mod;

        }
        return (int)ans;
    }
}