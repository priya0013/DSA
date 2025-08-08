class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(Integer f:map.values()){
            if(set.contains(f)){
                return false;
            }
            set.add(f);
        }
        return true;
    }
}