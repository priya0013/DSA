class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int l=0;
        int cnt=1;
        int ans[]=new int[nums.length-k+1];
        int id=0;
        for(int r=0;r<nums.length;r++){
            if(r>0 && nums[r]==nums[r-1]+1){
                cnt++;
            }else{
                cnt=1;
            }
            if(r-l+1==k){
                if(cnt>=k){
                    ans[id]=nums[r];
                }else{
                    ans[id]=-1;
                }
            
            
            id++;
            l++;
        }
        }
        return ans;
    }
}