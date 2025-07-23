class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int cnt=1;
        for(int i=1;i<s.length();i++){
            char cur=s.charAt(i);
            char pre=s.charAt(i-1);
            if(cur==pre){
                cnt++;
            }else{
                cnt=1;
            }
            if(cnt<3){
                sb.append(cur);
            }
        }
        return s.isEmpty()?"":s.charAt(0)+sb.toString();
    }
}