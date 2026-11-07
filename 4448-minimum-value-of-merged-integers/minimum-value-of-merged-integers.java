class Solution {
    public int minMergedInteger(int[] nums) {
        String []si=new String[nums.length];
        String s="";
        s+=nums[0];
        s+=nums[1];
        int min=Integer.parseInt(s);
        for(int i=nums.length-2;i>=0;i=i-2){
            String sa="";
            sa+=nums[i];
            sa+=nums[i+1];
            min=Math.min(min,Integer.parseInt(sa));
        }
        return min;
    }
}