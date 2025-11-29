class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i:nums){
            int rem=i%k;
            sum+=rem;
        }
        return sum%k;
    }
}