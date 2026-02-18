class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuilder sb=new StringBuilder();
        while(n!=0){
            int rem=n%2;
            sb.insert(0,rem);
            n/=2;
        }
        String res=sb.toString();
        for(int i=1;i<res.length();i++){
            if(res.charAt(i)==res.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
}