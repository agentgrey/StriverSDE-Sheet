// Use two pointers to represent starting index of both arrays
// Compare both elements, add the smaller element to the answer array increase the index
// If one of the indexes reach the last element make the last value MAX so that elements of the other array can be added
// Time:O(M+N)  Space:O(1)



public void merge(int[] nums1, int m, int[] nums2, int n) {
     int[] copy = Arrays.copyOfRange(nums1, 0, m);
     int c1 = 0, c2 = 0;
            
     for (int i = 0; i < nums1.length; i++) {
            if (c2 == nums2.length) {
                 c2--;
                 nums2[c2] = Integer.MAX_VALUE;
            }
            if (c1 == copy.length) {
                 c1--;
                 copy[c1] = Integer.MAX_VALUE;
            }
            if (copy[c1] > nums2[c2]) {
                 nums1[i] = nums2[c2++];
            } else {
                 nums1[i] = copy[c1++];
            }
       }
  }






// Initially take the gap as (m+n)/2
// Take as a pointer1=0 & pointer2=gap
// Run a loop from pointer1 & pointer2 to m+n and whenever arr[pointer2]<arr[pointer1], swap
// after loop reduce gap = gap/2
// repeat until gap>0
// Time:O(N+M)  Space:O(1)






static void merge(int ar1[], int ar2[], int n, int m) {
  // code here 
  int gap =(int) Math.ceil((double)(n + m) / 2.0);
  while (gap > 0) {
    int i = 0;
    int j = gap;
    while (j < (n + m)) {
      if (j < n && ar1[i] > ar1[j]) {
        swap(ar1[i], ar1[j]);
      } else if (j >= n && i < n && ar1[i] > ar2[j - n]) {
        swap(ar1[i], ar2[j - n]);
      } else if (j >= n && i >= n && ar2[i - n] > ar2[j - n]) {
        swap(ar2[i - n], ar2[j - n]);
      }
      j++;
      i++;
    }
    if (gap == 1) {
      gap = 0;
    } else {
      gap =(int) Math.ceil((double) gap / 2.0);
    }
  }

static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }