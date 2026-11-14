class Solution {
    public int minimizedStringLength(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int res=0;
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                res++;
            }
        }
        return res;
    }
}