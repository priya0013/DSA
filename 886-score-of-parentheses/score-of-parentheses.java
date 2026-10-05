class Solution {
    public int scoreOfParentheses(String s) {
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                cnt1++;
            }else{
                cnt1--;
                 if(s.charAt(i-1)=='('){
                cnt2+=1<<cnt1;
            }
        }
       
        }
        return cnt2;
    }
}