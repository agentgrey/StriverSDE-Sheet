// Brute Force
// Time:O(N^2)  Space:O(1)




static int trap(int[] arr) {
        int n = arr.length;
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            int j = i;
            int leftMax = 0, rightMax = 0;
            while (j >= 0) {
                leftMax = Math.max(leftMax, arr[j]);
                j--;
            }
            j = i;
            while (j < n) {
                rightMax = Math.max(rightMax, arr[j]);
                j++;
            }
            waterTrapped += Math.min(leftMax, rightMax) - arr[i];
        }
        return waterTrapped;
    }




// 2 Prefix Arrays
// Time:O(N)  Space:O(N)





 public int trap(int[] height) {
    
        int n = height.length;
        if(n<3){
            return 0;
        }
        
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        
        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];
        
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
            rightMax[n-i-1] = Math.max(rightMax[n-i], height[n-i-1]);
        }
        
        int trappedWater = 0;
        for(int i=0;i<n;i++){
            trappedWater += Math.min(leftMax[i], rightMax[i])-height[i];
        }
        
        return trappedWater;
        
    
    }




// Optimized Approach
// Time:O(N)  Space:O(1)




static int trap(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;
        int res = 0;
        int maxLeft = 0, maxRight = 0;
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    res += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    res += maxRight - height[right];
                }
                right--;
            }
        }
        return res;
    }