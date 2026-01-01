class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //Arrays.sort(Collections.reverseOrder());
        int mn=Integer.MAX_VALUE;
        int n=nums.length;
        int i=0;
        int sum=0;
            for(int j=0;j<n;j++){
                sum+=nums[j];
                while(sum>=target){
                    mn=Math.min(mn,j-i+1);
                    sum-=nums[i];
                    i++;
                }
            
        }
        //mn=Math.min(mn,cnt);
        return mn==Integer.MAX_VALUE?0:mn;

    }
}