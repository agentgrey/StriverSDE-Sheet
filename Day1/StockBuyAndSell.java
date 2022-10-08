// Brute Force
// Time:O(N^2)  Space:O(1)




static int maxProfit(int[] arr) {
        int maxPro = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    maxPro = Math.max(arr[j] - arr[i], maxPro);
                }
            }
        }
        return maxPro;
    }



// Starting from the first index, compare every element and keep track of the minimum value
// If the element is greater then store the maxProfit else update the minimum value
// Time:O(N)  Space:O(1)




static int maxProfit(int[] arr) {
    int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      minPrice = Math.min(minPrice, arr[i]);
      maxPro = Math.max(maxPro, arr[i] - minPrice);
    }
    return maxPro;
  }