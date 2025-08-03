class Solution {
    public String interpret(String s) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' && s.charAt(i+1)==')'){
                sb.append("o");
            } if(c=='(' && s.charAt(i+1)=='a'){
                sb.append("al");
            }if(c=='G'){
                sb.append("G");
            }
        }
        return sb.toString();
    }
}