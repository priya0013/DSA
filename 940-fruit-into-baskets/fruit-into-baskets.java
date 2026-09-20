class Solution {
    public int totalFruit(int[] fru) {
        int l=0;
        int r=0;
        int mx=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while(r<fru.length){
            mp.put(fru[r],mp.getOrDefault(fru[r],0)+1);
            while(mp.size()>2){
                mp.put(fru[l],mp.get(fru[l])-1);
                if(mp.get(fru[l])==0){
                    mp.remove(fru[l]);
                }
                l++;

            }
            r++;
            mx=Math.max(mx,r-l);

        }
        return mx;
    }
}