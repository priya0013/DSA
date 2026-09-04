class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int left=0;
        int max=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(mp.containsKey(c)){
                left=Math.max(left,mp.get(c)+1);
            }
            mp.put(c,r);
            max=Math.max(max,r-left+1);
        }
        return max;
        
    }
}