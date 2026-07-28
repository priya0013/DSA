class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[]=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int j=0;j<s.length();j++){
            freq[t.charAt(j)-'a']--;
        }
        for(int cnt:freq){
            if(cnt!=0){
                return false;
            }
        }
        return true;
    }
}