class Solution {
    public int minOperations(String s) {
        int s1=0;
        int s0=0;
        int mn=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='0'){
                    s1++;
                }else{
                    s0++;
                }
            }
            else{
                if(s.charAt(i)=='1'){
                    s1++;
                }else{
                    s0++;
                }
            }
        }
        mn=Math.min(s1,s0);
        return mn;
    }
}