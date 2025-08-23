class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0||j>=0||carry!=0){
            int add=carry;
            if(i>=0){
                add+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                add+=b.charAt(j)-'0';
                j--;
            }
            sb.append(add%2);
            carry=add/2;
        }
        return sb.reverse().toString();
    }
}