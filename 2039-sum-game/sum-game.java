class Solution {
    public boolean sumGame(String num) {
        int left=0;
        int leftq=0;
        int right=0;
        int rightq=0;
        int mid=num.length()/2;
        for(int i=0;i<mid;i++){
            char ch=num.charAt(i);
            if(ch=='?'){
                leftq++;
            }else{
                left+=ch-'0';
            }
        }
        for(int i=mid;i<num.length();i++){
            char ch=num.charAt(i);
            if(ch=='?'){
                rightq++;
            }else{
                right+=ch-'0';
            }
        }
        int diff=left-right;
        int diffq=leftq-rightq;
        if(diffq%2!=0){
            return true;
        }
        return diff!=-9*diffq/2;
    }
}