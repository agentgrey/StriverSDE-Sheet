// First transpose the matrix without using extra space
// swap every ith column with n-ith column
// Time:O(N*N)  Space:O(1)





public void rotate(int[][] matrix) {
//transpose
        for(int i=0; i<matrix.length; i++) {
            for(int j=i+1; j<matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

//swap        
        for(int i=0; i<matrix.length; i++) {
            for(int j = 0; j<matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }