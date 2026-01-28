class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(1,n,k,new ArrayList<>());
        return ans;
    }
    private void backtrack(int begin,int end,int k,List<Integer> arr){
        if(arr.size()==k){
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i=begin;i<=end;i++){
            arr.add(i);
            backtrack(i+1,end,k,arr);
            arr.remove(arr.size()-1);
        }

    }
}