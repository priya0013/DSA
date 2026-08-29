class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        int len=nums.size();
        for(int i=0;i<len;i++){
            boolean[] cont=new boolean[101];
            int cnt=0;
            for(int j=i;j<len;j++){
                int n=nums.get(j);
                if(!cont[n]){
                    cont[n]=true;
                    cnt++;
                }
                sum+=cnt*cnt;
            }
        }
        return sum;
    }
}