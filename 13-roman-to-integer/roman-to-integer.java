class Solution {
     public static int convert(char i){
        if(i=='I')
        return 1;
        if(i=='V')
        return 5;
        if(i=='X')
        return 10;
        if(i=='L')
        return 50;
        if(i=='C')
        return 100;
        if(i=='D')
        return 500;
        if(i=='M')
        return 1000;
       return -1;
    }
    public int romanToInt(String s) {
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
            
                int r1=convert(s.charAt(i));
               if(i+1<s.length()){
                int r2=convert(s.charAt(i+1));
                if(r1>=r2){
                    res+=r1;
                }else{
                    res+=(r2-r1);
                    i++;
                }
            }else{
                res+=r1;
            }
        }
        return res;
    }
}