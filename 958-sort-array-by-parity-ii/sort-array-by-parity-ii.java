class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int a[]=new int[nums.length];
        int e=0;
        int o=1;
        for(int i:nums){
            if(i%2==0){
                a[e]=i;
                e+=2;
            }if(i%2==1){
                a[o]=i;
                o+=2;

            }
        }
        return a;
    }
}