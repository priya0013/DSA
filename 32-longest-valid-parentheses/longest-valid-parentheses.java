class Solution {
    public int longestValidParentheses(String ss) {
        Stack<Integer> s=new Stack<>();
        int mx=0;
        s.push(-1);
        for(int i=0;i<ss.length();i++){
            if(ss.charAt(i)=='('){
                s.push(i);
            }else{
                s.pop();
            }
            if(s.isEmpty()){
                s.push(i);
            }else{
                mx=Math.max(mx,i-s.peek());
            }
        }
        return mx;
    }
}