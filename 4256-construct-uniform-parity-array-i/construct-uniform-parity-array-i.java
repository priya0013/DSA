class Solution {
    public boolean uniformArray(int[] nums1) {
        for(int i=1;i<nums1.length;i++){
            if(nums1[i]%2==0 && nums1[i]%2==0 || nums1[i]%2!=0 && nums1[i-1]%2!=0){
                return true;
            }else if(nums1[i]%2==0 && nums1[i-1]%2!=0){
                    return true;
                }
            }
        
        return true;
    }
}