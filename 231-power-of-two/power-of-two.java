class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)return false;
        double a=Math.log(n)/Math.log(2);
        return Math.abs(a-Math.round(a))<1e-10;
    }
}