// Keep count of the values
// Time:O(N)+O(N)  Space:O(1)



public void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {count0++;}
            if (nums[i] == 1) {count1++;}
            if (nums[i] == 2) {count2++;}
        }
        
        for(int i = 0; i < nums.length; i++) {
            if (i < count0) {nums[i] = 0;}
            else if (i < count0 + count1) {nums[i] = 1;}
            else {nums[i] = 2;}
        }
    }




// Three Pointer 
// Time:O(N)  Space:O(1)




 public void sortColors(int[] nums) {
        int start=0,end=nums.length-1,i=0;

        while(i<=end)
        {
            if(nums[i]==0)
            {
                int temp=nums[i];
                nums[i]=nums[start];
                nums[start]=temp;
                start++;
                i++;
            }
            else if(nums[i]==2)
            {
                int temp=nums[i];
                nums[i]=nums[end];
                nums[end]=temp;
                end--;
            }
            else
                i++;
        }