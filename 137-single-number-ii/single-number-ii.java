class Solution {
    public int singleNumber(int[] nums) {
        int o=0;
        int t=0;
        for(int x:nums){
            o=(o^x)&(~t);
            t=(t^x)&(~o);
        }
        return o;
    }
}