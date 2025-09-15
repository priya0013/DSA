class Solution {
public:
    long long interchangeableRectangles(vector<vector<int>>& rec) {
        long long cnt=0;
        map<double ,long long> mp;
        for(int i=0;i<rec.size();i++){
            double r1=(double)rec[i][0]/rec[i][1];
            mp[r1]++;
        }
        for(pair<double,long long> p:mp){
            long long n=p.second;
            cnt+=(n*(n-1)/2);
        }
        return cnt;
    }
};