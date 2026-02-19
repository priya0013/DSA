class Solution {
    public int countBinarySubstrings(String s) {
        int cur=1;
        int pre=0;
        int res=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cur+=1;
            }else{
                res+=Math.min(cur,pre);
                pre=cur;
                cur=1;
            }
        }
        res+=Math.min(cur,pre);
        return res;
    }
}