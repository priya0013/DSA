class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> l=new HashMap<>();
       
        for(int i=0;i<n;i++){
            int  b=target-nums[i];
            if(l.containsKey(b)){
                return new int []{l.get(b),i};
            }
            l.put(nums[i],i);
        }
        return new int []{0};
    }
}