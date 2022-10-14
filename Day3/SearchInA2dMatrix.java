// Jump Search
// Time:O(M+N)  Space:O(1)




public boolean searchMatrix(int[][] matrix, int target) {
        int i=0, j=matrix[0].length-1;
        
        while(i<matrix.length && j>=0) {
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]<target) i++;
            else j--;
        }
        
        return false;
    }





// Binary Search
// Time:O(log(M*N))  Space:O(1)




public boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0;
        if(matrix.length == 0) return false;
        int n = matrix.length; 
        int m = matrix[0].length; 
        int hi = (n * m) - 1;
        
        while(lo <= hi) {
            int mid = (lo + (hi - lo) / 2);
            if(matrix[mid/m][mid % m] == target) {
                return true;
            }
            if(matrix[mid/m][mid % m] < target) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return false;
    }