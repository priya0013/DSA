class Solution {
    public int jump(int[] nums) {
        int max_farth=0;
        int cur_end=0;
        int jump=0;
        for(int i=0;i<nums.length-1;i++){
            max_farth=Math.max(max_farth,i+nums[i]);
            if(i==cur_end){
                jump++;
                cur_end=max_farth;
            }
        }
        return jump;
    }
}