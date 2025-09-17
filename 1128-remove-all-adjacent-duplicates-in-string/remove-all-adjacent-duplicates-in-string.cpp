class Solution {
public:
    string removeDuplicates(string s) {
        string res;
        for(int i=0;i<s.size();i++){
            bool add=true;
            while(!res.empty() && res.back()==s[i]){
                res.pop_back();
                add=false;
            }
            if(add){
                res.push_back(s[i]);
            }
        }
        return res;
    }
};