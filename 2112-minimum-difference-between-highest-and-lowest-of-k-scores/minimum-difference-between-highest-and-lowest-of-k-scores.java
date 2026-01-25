class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
            for(int i=0;i+k-1<nums.length;i++){
                int sub=nums[i+k-1]-nums[i];
                ans=Math.min(ans,sub);
            }
        
        return ans;
    }
}