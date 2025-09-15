class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int cnt=0;
        map<int,int> mp;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;
        }
        for(pair<int,int> p:mp){
            int key=p.first;
            int value=p.second;
            cnt+=(value-1)*value/2;
        }
        return cnt;
    }
};