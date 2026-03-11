class Solution {
    public int bitwiseComplement(int n) {
        String com=Integer.toBinaryString(n);
        StringBuilder res=new StringBuilder();
        for(int i=0;i<com.length();i++){
            if(com.charAt(i)=='0'){
                res.append('1');
            }else{
                res.append('0');
            }
        }
        String s=res.toString();
        int ans=Integer.parseInt(s,2);
        return ans;
    }
}