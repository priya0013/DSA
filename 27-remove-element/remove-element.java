class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt=0;
        for(int x:nums){
            if(x!=val){
                nums[cnt]=x;
                cnt++;
                
            }
        }
        return cnt;
    }
}