class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        set<vector<int>> res;
        int sum=0;
        sort(nums.begin(),nums.end());
        int start=0;
        int n=nums.size();
        for(start=0;start<n-2;start++){
            if(start>0 && nums[start]==nums[start-1]) continue;
            int left=start+1;
        int right=nums.size()-1;
        while(left<right){
            sum=nums[start]+nums[left]+nums[right];
            if(sum==0){
                    res.insert({nums[start],nums[left],nums[right]});
                    left++;
                    right--;
            }else if(sum>0){
                right--;
            }else {
                left++;
            }
        }
        }
        vector<vector<int>> ans(res.begin(),res.end());
        return ans;
    }
};