class Solution {
    public int numIdenticalPairs(int[] nums) {
        int cnt=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
          for (int x :nums) {
            if (mp.containsKey(x)) {
               cnt+= mp.put(x,mp.get(x)+1);
            } else {
                mp.put(x,1);
            }
        }
        return cnt;
    }
}