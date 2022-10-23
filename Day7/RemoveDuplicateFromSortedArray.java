// Brute Force using extra space
// Time:O(NlogN)  Space:O(N)




static int removeDuplicates(int[] arr) {
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
    }



// Two pointer approach
// Time:O(N)  Space:O(1)




public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        int j=0;
        
        for (int i=0; i<nums.length; i++)
            if (nums[i]!=nums[j]) 
                nums[++j]=nums[i];
        
        return ++j
    }