// Using two lists to store the indexes of the 0s in the matrix
// Then converting all rows/cols of the stored index to 0
// Time: O(mn), Space: O(m+n)



public void setZeroes(int[][] matrix) {
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    l1.add(i);
                    l2.add(j);
                }
            }
        }
        
        for(int i:l1){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=0;
            }
        }
        
        for(int i:l2){
            for(int j=0;j<matrix.length;j++){
                matrix[j][i]=0;
            }
        }
    }
