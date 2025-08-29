class Solution {
    public long flowerGame(int n, int m) {
        long oddL=(n+1)/2;
        long evenL=(n/2);
        long oddM=(m+1)/2;
        long evenM=(m/2);
        return (oddL*evenM)+(evenL*oddM);
    }
}