class Solution {
    public boolean checkIfPangram(String s) {
        boolean visit[]=new boolean[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z'){
                visit[c-'a']=true;
               // break;
            }else if(c>='A' && c<='Z'){
                visit[c-'A']=true;
               // break;
            }
            
        }
        for(int i=0;i<26;i++){
            if(!visit[i]){
                return false;
            }
        }
        return true;
    }
}