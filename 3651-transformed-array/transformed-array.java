class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int mov=nums[i];
            if(nums[i]==0){
                arr[i]=nums[i];
            }else{
                int id=(i+mov)%n;
                if(id<0){
                    id+=n;
                }
            
            arr[i]=nums[id];
            }
        }
        return arr;
    }
}