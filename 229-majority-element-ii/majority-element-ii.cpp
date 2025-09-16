class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> ans;
        int cand1=0, cand2=1;
        int cnt1=0,cnt2=0;
        for(int n:nums){
            
            if(cnt1==0 && cand2!=n){
             cand1=n; 
             
            }
            else if(cnt2==0 && cand1!=n){
            cand2=n; 
            
            }
            if(cand1==n) 
                cnt1++;
            else if(cand2==n) 
                 cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1=cnt2=0;
        for(int i=0;i<nums.size();i++){
            if(cand1==nums[i]) cnt1++;
            else if(cand2==nums[i]) cnt2++;
        }
        if(cnt1>nums.size()/3) 
            ans.push_back(cand1);
        if(cnt2>nums.size()/3) 
            ans.push_back(cand2);
        return ans;
    }
};