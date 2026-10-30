class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int x:nums){
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }
        if(nums.length<=2){
            return -1;
        }
        int ans=0;
        for(int i:nums){
            if(i!=min && i!=max){
                ans=i;
            }
        }
        return ans;
    }
}