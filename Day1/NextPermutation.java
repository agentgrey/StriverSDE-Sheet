// Get the index from where the increasing sequence starts.
// Linearly traverse the array from backward and find an index that has a value greater than the previously found index. 
// Swap values present in indices
// Reverse array from index+1 till the end of the array.
// Time:O(N)   Space:O(1)



public void nextPermutation(int[] A) {
        if(A == null || A.length <= 1) return;
        int i = A.length - 2;
        while(i >= 0 && A[i] >= A[i + 1]) i--; 
        if(i >= 0) {                           
            int j = A.length - 1;              
            while(A[j] <= A[i]) j--;      
            swap(A, i, j);                     
        }
        reverse(A, i + 1, A.length - 1);      
}

public void swap(int[] A, int i, int j) {
    int tmp = A[i];
    A[i] = A[j];
    A[j] = tmp;
}

public void reverse(int[] A, int i, int j) {
    while(i < j) swap(A, i++, j--);
}