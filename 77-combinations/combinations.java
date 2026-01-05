class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        backtrack(1,c,ans,n,k);
        return ans;
        
    }
    public void backtrack(int start,List<Integer> c,List<List<Integer>> ans,int n,int k){
        if(c.size()==k){
            ans.add(new ArrayList<>(c));
            return;
        }
        for(int i=start;i<=n;i++){
            c.add(i);
            backtrack(i+1,c,ans,n,k);
            c.remove(c.size()-1);
        }
    }
}