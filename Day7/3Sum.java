// Brute Force
// Time:O(N^3)  Space:O(K)




static ArrayList < ArrayList < Integer >> threeSum(int nums[]) {
        ArrayList < ArrayList < Integer >> ans = new ArrayList < > ();

        int i, j, k;
        for (i = 0; i < nums.length - 2; i++) {
            for (j = i + 1; j < nums.length - 1; j++) {
                for (k = j + 1; k < nums.length; k++) {
                    ArrayList < Integer > temp = new ArrayList < > ();
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                    }
                    if (temp.size() != 0)
                        ans.add(temp);
                }
            }
        }

        return ans;
    }




// Fix one pointer and apply two pointer approach to rest two numbers
// Time:O(N^2)  Space:O(K)





class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res  = new HashSet<>();

        if(nums.length==0) return new ArrayList<>(res);
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++) {
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k]; 
                if(sum==0) res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if ( sum >0) k--;
                else if (sum<0) j++;
            }
        }
        
        return new ArrayList<>(res);
    }
}