class Solution {
    public void reverse(int []stones,int l,int r){
        //int l=0;
        r=r-1;
        while(l<r){
            int temp=stones[l];
            stones[l]=stones[r];
            stones[r]=temp;
            l++;
            r--;
        }
    }
    public int lastStoneWeight(int[] stones) {
        //List<Integer> l=new ArrayList<>();
        int n=stones.length;
        
        while(n>1){
            Arrays.sort(stones,0,n);
            reverse(stones,0,n);
            int first=stones[0];
            int second=stones[1];
            
                for(int i=2;i<n;i++){
                    stones[i-2]=stones[i];
                }
                n = n - 2;

            if (first != second) {
                int newone = first - second;
                stones[n] = newone;
                n++;
            }
            
        }
        return n==0?0:stones[0];
    }
}