class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> s=new HashSet<>();
        for(int x:nums){
            s.add(x);
        }
        int res=original;
        while(s.contains(res)){
            res*=2;
                
        }
        
        return res;
    }
}