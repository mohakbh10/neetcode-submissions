class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> setRows = new HashSet<>();
        HashSet<Integer> setCols =new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    setRows.add(i);
                    setCols.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(setRows.contains(i) || setCols.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
