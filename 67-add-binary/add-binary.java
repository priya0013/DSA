class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
        while(i>=0||j>=0||c!=0){
            int cum=c;
            if(i>=0){
                cum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                cum+=b.charAt(j)-'0';
                j--;
            }
            s.append(cum%2);
            c=cum/2;
        }
        return s.reverse().toString();
        }
}