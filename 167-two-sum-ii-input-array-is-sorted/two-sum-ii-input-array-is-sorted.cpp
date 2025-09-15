class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
         map<int,int> mp;
        for(int i=0;i<nums.size();i++){
            int b=target-nums[i];
            if(mp.contains(b))
                return {mp[b],(i+1)};
                mp[nums[i]]=(i+1);
            
        }
        return {-1,-1};
    }
};