class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int ele=1;
        for(int i:nums){
            if(i==ele){
                ele+=1;
            }else if(i>ele){
                break;
            }
        }
        return ele;
    }
}