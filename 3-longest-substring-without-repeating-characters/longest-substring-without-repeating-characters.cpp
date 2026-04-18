class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        vector<bool> vis(128,false);
        int n=s.size();
        int mx=0;
        int l=0;
        for(int r=0;r<n;r++){
            while(vis[s[r]]){
                vis[s[l]]=false;
                l++;
            }
            vis[s[r]]=true;
            mx=max(mx,r-l+1);
        }
        return mx;
    }
};