class Solution {
public:
void reverse(vector<int>&nums, int l,int r){
    int temp;
    while(l<r){
        temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;
        r--;
    }
}
    void rotate(vector<int>& nums, int k) {
        int temp;
        int len=nums.size();
        k=k%len;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
    }
};