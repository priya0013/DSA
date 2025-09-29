class Solution {
public:
    int largestRectangleArea(vector<int>& height) {
        height.push_back(0);
        int maxarea=0;
        stack<int> st;
        int n=height.size();
        for(int i=0;i<n;i++){
            while(!st.empty() && height[st.top()]>height[i]){
                int heig=height[st.top()];
                st.pop();
            
                int width;
                if(st.empty()){
                    width=i;
                }else{
                    width=i-st.top()-1;
                }
                maxarea=max(maxarea,heig*width);

            }

            st.push(i);
        }
        return maxarea;
    }
};