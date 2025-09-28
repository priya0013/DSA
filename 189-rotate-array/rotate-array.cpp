class Solution {
public:
    static void swap(vector<int>& arr,int l,int r){
        while(l<r){
            int t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
    }
    void rotate(vector<int>& nums, int k) {
        k%=nums.size();
        swap(nums,0,nums.size()-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.size()-1);
    }
};