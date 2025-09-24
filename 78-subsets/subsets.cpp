class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
            sort(nums.begin(),nums.end());
        vector<vector<int>> res;
        vector<int> f;
        backtrack(0,nums,res,nums.size(),f);
        return res;
    }
    void backtrack(int a,vector<int>& nums,vector<vector<int>>& res,int size,vector<int>& f){
        if(a==size){
            res.push_back(f);
            return ;
        }
        f.push_back(nums[a]);
        backtrack(a+1,nums,res,nums.size(),f);
        f.pop_back();
        backtrack(a+1,nums,res,nums.size(),f);
    }
};