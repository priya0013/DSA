class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int x:nums){
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=min;i<=max;i++){
            boolean found=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                l.add(i);
            }
        }
        return l;
    }
}