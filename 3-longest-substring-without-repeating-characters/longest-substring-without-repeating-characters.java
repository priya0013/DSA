class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int[] last=new int[128];
        int mx=0;
        for(int r=0;r<s.length();r++){
            char cur=s.charAt(r);
            if(last[cur]>l){
                l=last[cur];
            }
            last[cur]=r+1;
        
        mx=Math.max(mx,r-l+1);
        }
        return mx;
    }
}