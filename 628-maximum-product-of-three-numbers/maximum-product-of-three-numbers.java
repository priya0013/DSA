class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        int prod=1;
        int prod1=1;
         int first=Integer.MIN_VALUE;
         int second=Integer.MIN_VALUE;
         int third=Integer.MIN_VALUE;

         int mn1=Integer.MAX_VALUE;
         int mn2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            
                if(nums[i]>=first){
                    third=second;
                    second=first;
                    first=nums[i];
                }else if(nums[i]>=second){
                    third=second;
                    second=nums[i];
                }else if(nums[i]>third){
                    third=nums[i];
                }
                if(nums[i]<=mn1){
                    mn2=mn1;
                    mn1=nums[i];
                }else if(nums[i]<mn2){
                    mn2=nums[i];
                }
            

        }
        prod=first*second*third;
        prod1=mn1*mn2*first;
        return Math.max(prod,prod1);
    }
}