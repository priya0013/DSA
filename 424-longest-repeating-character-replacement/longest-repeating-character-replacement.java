class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxlen=0;
        int maxfreq=0;
        int freq[]=new int[26];
        while(r<s.length()){//traverse to all elemments
            freq[s.charAt(r)-'A']++;//frequency of the character
            maxfreq=Math.max(maxfreq,freq[s.charAt(r)-'A']);//find which element has highest frequency
            while((r-l+1)-maxfreq>k){//(r-l+1)ithu vanthu window size, window size thaandi pochuna window invalid=>so enna panrom na window va shrink pananu athuku left remove panitu varanu
                freq[s.charAt(l)-'A']--;
                l++;
                maxfreq=0;
                for(int i=0;i<26;i++){// agsin high frequency edukanu
                    maxfreq=Math.max(maxfreq,freq[i]);
                    //l++;
                }
            }
            if((r-l+1)-maxfreq<=k){//enga window size lees and equal ahh iruntha max length element repeated return pananu
                maxlen=Math.max(maxlen,r-l+1);
                
            }
            r++;
        }
        return maxlen;
    }
}