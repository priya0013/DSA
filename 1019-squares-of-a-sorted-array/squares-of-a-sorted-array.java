class Solution {
    public int[] sortedSquares(int[] nums) {
        int num[]=new int[nums.length];
        int l=0;
        int r=nums.length-1;
         int i=nums.length-1;
        while(l<=r){
           
            int a=nums[l]*nums[l];
            int b=nums[r]*nums[r];
            if(a>b){
                num[i]=a;
                l++;
            }else{
                num[i]=b;
                r--;
            }
            i--;
        }
        return num;
    }
}