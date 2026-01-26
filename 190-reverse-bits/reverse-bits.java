class Solution {
    public int reverseBits(int n) {
        int rev=Integer.reverse(n);
        String bin=Integer.toBinaryString(rev);
        int res=Integer.parseInt(bin,2);
        return res;

    }
}