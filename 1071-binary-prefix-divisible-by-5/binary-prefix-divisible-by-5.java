class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=new ArrayList<>();
        int ad=0;
        for(int bit:nums){
            ad=(ad*2+bit)%5;
            ans.add(ad==0);
        }
        return ans;
    }
}