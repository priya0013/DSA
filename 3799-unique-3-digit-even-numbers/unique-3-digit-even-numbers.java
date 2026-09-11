class Solution {
    public int totalNumbers(int[] d) {
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<d.length;i++){
            if(d[i]%2!=0){
                continue;
            }
            for(int j=0;j<d.length;j++){
                if(i==j){
                    continue;
                }
                for(int k=0;k<d.length;k++){
                    if(i==k||j==k){
                        continue;
                    }
                    if(d[k]==0){
                        continue;
                    }
                    int num=d[k]*100+d[j]*10+d[i];
                    s.add(num);
                }
            }
            
        }
        return s.size();
    }
}