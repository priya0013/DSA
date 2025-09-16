class Solution {
public:
    int majorityElement(vector<int>& nums) {
        map<int,int> mp;
        int ans=0;
        int max=0;
        for(int i:nums){
        mp[i]++;
        if(mp[i]>max){
            ans=i;
            max=mp[i];
        }
        }
        return ans;


    }
};