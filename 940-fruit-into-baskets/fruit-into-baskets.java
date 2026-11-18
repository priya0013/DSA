class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int r=0;
        int mx=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while(r<fruits.length){
            mp.put(fruits[r],mp.getOrDefault(fruits[r],0)+1);
            while(mp.size()>2){
                int f=fruits[l];
                mp.put(f,mp.get(f)-1);
                if(mp.get(f)==0){
                    mp.remove(f);
                }
                l++;

            }
            
            mx=Math.max(r-l+1,mx);
            r++;
            
        }
        return mx;

    }
}