class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int cursum=0;
        int minlen=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            cursum+=nums[r];
            while(cursum>=target){
                minlen=Math.min(minlen,r-l+1);
                cursum-=nums[l];
                l++;
            }
        }
        return (minlen==Integer.MAX_VALUE)?0:minlen;
    }
}