class Solution {
    public boolean isSubsequence(String s, String t) {
            int count=0;
            for(char t1:t.toCharArray()){
                if(count<s.length() && t1==s.charAt(count)){
                    count++;
                }
            
        }
        return count==s.length();
    }
}