class Solution {
    public String defangIPaddr(String a) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c=='.'){
              sb.append("[.]");
            }
             else{
                  sb.append(c);
            }
        }
        return sb.toString();
    }
}