// Brute Force
// Time:O(N)  Space:O(1)



 public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max=0;
        
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0)
                c=0;
            else c++;
            
            max=Math.max(max,c);
        }
        return max;
    }