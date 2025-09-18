class Solution {
public:
    int characterReplacement(string s, int k) {
        int res=0;
        int maxfreq=0;
        map<char,int> mp;
        for(int l=0,r=0;r<s.size();r++){
            mp[s[r]]++;
            maxfreq=max(maxfreq,mp[s[r]]);
            while(r-l+1-maxfreq>k){
                mp[s[l]]--;
                l++;
            }
            res=max(res,r-l+1);
        }
        return res;
    }
};