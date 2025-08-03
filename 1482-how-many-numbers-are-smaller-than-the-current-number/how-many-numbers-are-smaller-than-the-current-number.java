class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int num[]=new int[nums.length];
        for(int a=0;a<nums.length;a++){
        int cnt=0;
             for(int i=0;i<nums.length;i++){
                  if(nums[a]>nums[i]){
                     cnt++;
            }
        }
            num[a]=cnt;
        }
        return num;
        
    }
}