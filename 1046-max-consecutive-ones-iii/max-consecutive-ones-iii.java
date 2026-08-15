class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero_cnt=0;
        int maxlen=0;
        int left=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zero_cnt++;
            }
            while(zero_cnt>k){
                if(nums[left]==0){
                    zero_cnt--;
                }
                left++;
            }
            maxlen=Math.max(maxlen,r-left+1);
        }
        return maxlen;
    }
}