class Solution {
    public int findGCD(int[] nums) {
        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            mn=Math.min(nums[i],mn);
            mx=Math.max(nums[i],mx);
        }
        while(mx!=0){
            int temp=mn%mx;
            mn=mx;
            mx=temp;
        }
        return mn;
    }
}