class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int x:nums){
            if(s.contains(x)){
                return x;
            }
            s.add(x);
        }
        return -1;
    }
}