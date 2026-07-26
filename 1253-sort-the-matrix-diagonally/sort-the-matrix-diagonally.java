class Solution {
    private static void sort(int mat[][],int r,int c){
        List<Integer> l=new ArrayList<>();
        int i=r;
        int j=c;
        while(i<mat.length && j<mat[0].length){
            l.add(mat[i][j]);
            i++;
            j++;
        }
        Collections.sort(l);
        i=r;
        j=c;
        int id=0;
        while(i<mat.length && j<mat[0].length){
            mat[i][j]=l.get(id);
            id++;
            i++;
            j++;
        }
    }
    public int[][] diagonalSort(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        for(int j=0;j<c;j++){
            sort(mat,0,j);
        }
        for(int i=1;i<r;i++){
            sort(mat,i,0);
        }
    
    return mat;
    }
}