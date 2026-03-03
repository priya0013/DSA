class Solution {
    public char findKthBit(int n, int k) {
        int cnt=0;
        int l=(1<<n)-1;
        while(k>1){
            if(k==l/2+1){
                return cnt%2==0?'1':'0';
            }
            if(k>l/2){
                k=l+1-k;
                cnt++;
            }
            l/=2;
        }
        return cnt%2==0?'0':'1';
    }
}