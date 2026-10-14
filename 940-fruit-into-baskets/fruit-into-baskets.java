class Solution {
    public int totalFruit(int[] fru) {
        int l=0;
        int r=0;
        int mx=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while(r<fru.length){
            mp.put(fru[r],mp.getOrDefault(fru[r],0)+1);
            while(mp.size()>2){
                int fr=fru[l];
                mp.put(fr,mp.get(fr)-1);
                if(mp.get(fr)==0){
                    mp.remove(fr);
                }
                l++;
            }
            mx=Math.max(mx,r-l+1);
            r++;
        }
        return mx;
    }
}