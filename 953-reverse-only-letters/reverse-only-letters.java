class Solution {
    public String reverseOnlyLetters(String s) {
        int l=0;
        int r=s.length()-1;
        char c[]=s.toCharArray();
        while(l<r){
            if(!Character.isLetter(c[l])){
                l++;
            }else if(!Character.isLetter(c[r])){
                r--;
            }else{
                char t=c[l];
                c[l]=c[r];
                c[r]=t;
                l++;
                r--;
            }
        }
        return new String(c);
    }
}