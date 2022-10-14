// Sort and print the (n/2 +1)th element
// Time:O(NlogN)  Space:O(1)




public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }



// Moore's Voting Algorithm
// Time:O(N)  Space:O(1)




public int majorityElement(int[] nums) {
        
        int count = 0;
        int first = nums[0];
        
        for(int i = 0;i < nums.length;i++)
        {
            if(count == 0){
                first = nums[i];
                count++;
            }
            else if(first == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return first;
    }