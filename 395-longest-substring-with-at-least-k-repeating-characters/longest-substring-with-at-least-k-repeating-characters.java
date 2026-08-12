class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length()<k){
            return 0;
        }
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']<k){
                String left=s.substring(0,i);
                String right=s.substring(i+1);
                int llen=longestSubstring(left,k);
                int rlen=longestSubstring(right,k);
                return Math.max(llen,rlen);
            }
        }
        return s.length();
    }
}