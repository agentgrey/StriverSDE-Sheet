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






// Storing index of the 0 elements in the first row and column to remove extra space
// Boolean fr and fc store the presence of 0 in the first row and first column
// Time: O(mn), Space: O(1)



public void setZeroes(int[][] matrix) {
    boolean fr = false,fc = false;
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j] == 0) {
                if(i == 0) fr = true;
                if(j == 0) fc = true;
                matrix[0][j] = 0;
                matrix[i][0] = 0;
            }
        }
    }
    for(int i = 1; i < matrix.length; i++) {
        for(int j = 1; j < matrix[0].length; j++) {
            if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
            }
        }
    }
    if(fr) {
        for(int j = 0; j < matrix[0].length; j++) {
            matrix[0][j] = 0;
        }
    }
    if(fc) {
        for(int i = 0; i < matrix.length; i++) {
            matrix[i][0] = 0;
        }
    }
    
}