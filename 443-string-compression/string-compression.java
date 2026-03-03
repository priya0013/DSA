class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0;
        int j=0;
        while(i<n){
            char cur=chars[i];
            int cnt=0;
            while(i<n && chars[i]==cur){
                i++;
                cnt++;
            }
            chars[j++]=cur;
            if(cnt>1){
                String s=String.valueOf(cnt);
                for(char c:s.toCharArray()){
                    chars[j++]=c;
                }
            }
        }
            return j;
        }
    
}