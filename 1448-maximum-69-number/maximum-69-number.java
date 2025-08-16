class Solution {
    public int maximum69Number (int num) {
        int temp=num;
        int inplace=1;
        int tochange=0;
        while(num>0){
            int d=num%10;
            if(d==6){
                tochange=inplace;
            }
            num/=10;
            inplace*=10;
        }
        return temp+3*tochange;
    }
}