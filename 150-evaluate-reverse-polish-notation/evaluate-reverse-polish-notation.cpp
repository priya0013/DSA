class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        int ans=0;
        stack<int> s;
        for(int i=0;i<tokens.size();i++){
            if(tokens[i]=="+" || tokens[i]=="-" ||tokens[i]=="*" || tokens[i]=="/"){
                int op2=s.top();
                s.pop();
                int op1=s.top();
                s.pop();
                if(tokens[i]=="+")s.push(op1+op2);
                if(tokens[i]=="-")s.push(op1-op2);
                if(tokens[i]=="*")s.push(op1*op2);
                if(tokens[i]=="/")s.push(op1/op2);
            }
            else s.push(stoi(tokens[i]));
        }
        return s.top();
    }
};