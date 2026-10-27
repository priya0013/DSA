class Solution {
    public int vowelConsonantScore(String s) {
        int v=0;
        int cn=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                v++;
            }else if(Character.isLetter(c)){
                cn++;
            }

        }
        if(cn==0){
            return 0;
    }
        return v/cn;
    }
}