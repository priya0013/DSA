class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> res;
        vector<int> comb;
        backtrack(0,0,candidates,target,res,comb);
        return res;
    }
    void backtrack(int a,int sum,vector<int>& candidates,int target,vector<vector<int>>& res,vector<int> comb){
            if(sum==target){
                res.push_back(comb);
                return ;
            }
            if(sum>target || a>=candidates.size()){
                return ;
            }
            comb.push_back(candidates[a]);
            backtrack(a,sum+candidates[a],candidates,target,res,comb);
            comb.pop_back();
            backtrack(a+1,sum,candidates,target,res,comb);


        
    }

};