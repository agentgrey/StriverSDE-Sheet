// Two Pointer
// First sort the array and then using the left and right pointers find the target
// Time:O(NlogN)  Space:O(N)





public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
	  int[] arr = nums;
	  Arrays.sort(nums);

        int left=0, right=n-1;
	  int a=0,b=0;
 	  
	  while(left<right) {
		if(nums[left]+nums[right]==target) {
			a = nums[left];
			b = nums[right];
			break;
		}
		else if(nums[left]+nums[right]>target
			right--;
		else 
			left++;
	  }

	  int[] ans = new int[2];

	  for(int i=0; i<nums.size(); i++) {
		if(arr[i]==a) ans[0]=i;
		else if(arr[i]==b) ans[1]=i;
	  }

	  return ans;

    }




// Hashing
// Time:O(N)  Space:O(N)




 public int[] twoSum(int[] nums, int target) {
        int[] arr = nums;
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        
        return result; 
    }
}