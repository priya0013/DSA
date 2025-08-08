class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r=grid.length;
        int c=grid[0].length;
        int n=r*c;
        int a=0;
        int arr[]=new int[n];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[a++]=grid[i][j];
            }
        }
        int []shift=new int[n];
        for(int i=0;i<n;i++){
            shift[(i+k)%n]=arr[i];
        }
        int d=0;
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<r;i++){
            List<Integer> x=new ArrayList<>();
            for(int j=0;j<c;j++){
                x.add(shift[d++]);
            }
            l.add(x);
        }
        return l;
    }
}