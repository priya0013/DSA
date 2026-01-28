class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(ans,new ArrayList<>(),nums);
        return ans;
    }
    private void backtrack(List<List<Integer>> ans,List<Integer> res,int[]arr){
        if(res.size()==arr.length){
            ans.add(new ArrayList<>(res));
            return;
        }else{
            for(int i=0;i<arr.length;i++){
                if(res.contains(arr[i])) continue;
                res.add(arr[i]);
                backtrack(ans,res,arr);
                res.remove(res.size()-1);
            }
        }
    }
}