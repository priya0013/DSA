class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(0,nums,ans);
        return ans;
    }
    private void backtrack(int index,int nums[],List<List<Integer>> ans){
        if(index==nums.length){
            List<Integer> ls=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ls.add(nums[i]);
            }
            ans.add(new ArrayList<>(ls));
            return ;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            backtrack(index+1,nums,ans);
            swap(i,index,nums);
        }

    }
    private void swap(int a,int b,int nums[]){
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }
}