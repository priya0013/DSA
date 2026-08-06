class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxlen=0;
        int maxfreq=0;
        int freq[]=new int[26];
        while(r<s.length()){
            freq[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(r)-'A']);
            while((r-l+1)-maxfreq>k){
                freq[s.charAt(l)-'A']--;
                l++;
                maxfreq=0;
                for(int i=0;i<26;i++){
                    maxfreq=Math.max(maxfreq,freq[i]);
                    //l++;
                }
            }
            if((r-l+1)-maxfreq<=k){
                maxlen=Math.max(maxlen,r-l+1);
                
            }
            r++;
        }
        return maxlen;
    }
}