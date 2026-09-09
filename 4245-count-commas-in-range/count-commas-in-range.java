class Solution {
    public int countCommas(int n) {
        int cnt=0;
        if(n>=1000){
            for(int i=1000;i<=n;i++){
            
                 cnt++;
            }
        }else{
            return 0;
        }
        return cnt;
    }
}