class Solution {
    public int bestClosingTime(String cu) {
        int n=cu.length();
        int penl=0;
        
        for(char c:cu.toCharArray()){
            if(c=='Y'){
                penl++;
            }
        }
        int hrs=0;
        int minval=penl;
        for(int i=0;i<n;i++){
            if(cu.charAt(i)=='Y'){
                penl--;
            }else{
                penl++;
            }
            if(penl<minval){
                minval=penl;
            
                hrs=i+1;
            }

        }
           
        
        return hrs;
    }
}