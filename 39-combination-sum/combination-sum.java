class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0,candidates,target,new ArrayList<>());
        return ans;
    }
    private void backtrack(int begin,int []arr,int target,List<Integer> res){
        if (target == 0) {
            ans.add(new ArrayList<>(res));
            return;
        }
        if(target<0)return;
        for(int i=begin;i<arr.length;i++){
            res.add(arr[i]);
            backtrack(i,arr,target-arr[i],res);
            res.remove(res.size()-1);
        }
    }
}