class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
    double avg=-INFINITY;
    int l,r,sum=0;
    for(l=r=0;r<nums.size();r++){
        sum+=nums[r];
        if(r-l+1==k){
            double  a=(double)sum/k;
            avg=max(avg,a);
            sum-=nums[l++];
        }
    }
    return avg;
    }
};