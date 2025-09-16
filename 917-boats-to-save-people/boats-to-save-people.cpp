class Solution {
public:
    int numRescueBoats(vector<int>& p, int limit) {
        sort(p.begin(),p.end());
        int cnt=0;
        int l=0;
        int r=p.size()-1;
        while(l<=r){
            int sum=p[l]+p[r];
            if(sum<=limit){
                cnt++;
                l++;
                r--;
            }
            else{
                cnt++;
                r--;
            }
        }
        return cnt;
    }
};