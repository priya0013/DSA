class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int num[]=new int[nums.length];
        int r=nums.length-1;
        int id=nums.length-1;
        while(l<=r){
            int a=nums[l]*nums[l];
            int b=nums[r]*nums[r];
            if(a>b){
                num[id]=a;
                l++;
            }else{
                num[id]=b;
                r--;
            }
            id--;
        }
        return num;
    }
}