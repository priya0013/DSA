class Solution {
    public boolean isValid(String s) {
        Stack<Character> c=new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='('){
                c.push(')');
            }else if(i=='{'){
                c.push('}');
            }else if(i=='['){
                c.push(']');
            }else{
                if(c.isEmpty() || c.pop()!=i){
                    return false;
                }
            }
        }
        return c.isEmpty();
    }
}