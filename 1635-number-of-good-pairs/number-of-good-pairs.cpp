class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int cnt=0;
        int arr[101]={0};
        for(int i=0;i<nums.size();i++){
            arr[nums[i]]++;
        }
        for(int i=0;i<=100;i++){
           // int key=p.first;
            int value=arr[i];
            cnt+=(value-1)*value/2;
        }
        return cnt;
    }
};