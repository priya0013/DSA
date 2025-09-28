class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        map<int,int> mp;
        int cnt=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            mp[nums[i]]++;
        }
            for(pair<int,int> p:mp){
                int k=p.first;
                int v=p.second;
                cnt+=(v-1)*v/2;
            
        }
        return cnt;
    }
};