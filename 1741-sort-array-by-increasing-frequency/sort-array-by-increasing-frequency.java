class Solution {
    public int[] frequencySort(int[] nums) {
        int freq[]=new int[201];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]+100]++;
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int f1=freq[nums[i]+100];
                int f2=freq[nums[j]+100];
                if(f1>f2|| f1==f2 && nums[i]<nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}