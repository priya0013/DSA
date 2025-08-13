class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandy=0;
        for(int c:candies){
            maxcandy=Math.max(c,maxcandy);
        }
        List<Boolean> res=new ArrayList<>();
        for(int c:candies){
            res.add(c+extraCandies>=maxcandy);
        }
        return res;
    }
}