class Solution {
     List<String> so=new ArrayList<>();
    public String getHappyString(int n, int k) {
        generate("",n);
        if(k>so.size()){
            return "";
        }
        return so.get(k-1);
    }
       
        void generate(String s,int n){
            if(s.length()==n){
                so.add(s);
                return ;
            }
            char []c={'a','b','c'};
            for(char ch:c){
                if(s.length()==0 || s.charAt(s.length()-1)!=ch){
                    generate(s+ch,n);
                }
            }
        }
    
}