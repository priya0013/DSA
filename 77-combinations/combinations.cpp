class Solution {
public:
    vector<vector<int>> combine(int n, int k) {
        vector<vector<int>> res;
        vector<int> combi;
        backtrack(n,k,res,1,combi);
        return res;

    }
    void backtrack(int n,int k,vector<vector<int>>& res,int cur,vector<int>& comb){
            if(comb.size()==k){
                res.push_back(comb);
                return ;
            }
            for(int i=cur;i<=n;i++){
                comb.push_back(i);
                backtrack(n,k,res,i+1,comb);
                comb.pop_back();
            }
    }
};