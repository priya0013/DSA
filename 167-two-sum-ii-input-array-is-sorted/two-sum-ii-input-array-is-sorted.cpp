class Solution {
public:
    vector<int> twoSum(vector<int>& n, int target) {
        int s=n.size();
        int l=0;
        int r=s-1;
        sort(n.begin(),n.end());
        while(l<r){
            int sum=n[l]+n[r];
            if(sum==target){
                return {l+1,r+1};
            }
            else if(sum>target){
                r--;
            }else{
                 l++;
            }
        }
        return {-1,-1};
    }
};