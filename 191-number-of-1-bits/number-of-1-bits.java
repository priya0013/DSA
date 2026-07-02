class Solution {
    public int hammingWeight(int n) {
        //String s=
        int cnt=0;
        while(n>0){
            int rem=n%2;
            if(rem==1){
                cnt++;
            }
            n/=2;
        }
        return cnt;
    }
}