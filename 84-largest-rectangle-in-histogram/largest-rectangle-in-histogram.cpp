class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        stack<int> s;
        int max_area=0;
        for(int i=0;i<=heights.size();i++){
            while(!s.empty() && ((i==heights.size()) || heights[s.top()]>heights[i])){
                int height=heights[s.top()];
                s.pop();
                int wid;
                if(s.empty()){
                    wid=i;
                }else{
                    wid=i-s.top()-1;
                }
                max_area=max(max_area,height*wid);
            }
            s.push(i);
        }
        return max_area;
    }
};