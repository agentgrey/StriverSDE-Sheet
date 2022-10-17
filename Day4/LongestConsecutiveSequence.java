// Use a HashMap and check the presence of nums[i]-1 and nums[i]+1, if present add 1 to their length else add length 1 to nums[i]
// Time:O(N)  Space:O(N)





public int longestConsecutive(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            int k = nums[i];
            if(!map.containsKey(k)) {
                int left = map.containsKey(k-1) ? map.get(k-1) : 0;
                int right = map.containsKey(k+1) ? map.get(k+1) : 0;
                
                int sum = left+right+1;
                map.put(k,sum);
                
                res = Math.max(sum, res);
                
                map.put(k-left, sum);
                map.put(k+right, sum);
            }
        }
        
        return res;
    }




// Using HashSet but first adding all the elements and then one by one checking the max subsequence length
// Time:O(N)  Space:O(N)





public static int longestConsecutive(int[] nums) {
        Set < Integer > hashSet = new HashSet < Integer > ();
        for (int num: nums) {
            hashSet.add(num);
        }

        int longestStreak = 0;

        for (int num: nums) {
            if (!hashSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (hashSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }