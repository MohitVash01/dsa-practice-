class Solution {
    public void moveZeroes(int[] nums) 
    {
        int position = -1;
        int i = 0;
        while(i<nums.length)
        {
            if(nums[i] ==0)
            {
                position = i;
                break;
            }
        i++;
        }
        if(position ==-1)
        {
            return;
        }
        else
        {
            i = position+1;
            while(i<nums.length)
            {
                if(nums[i]!=0)
                {
                    nums[position] = nums[i];
                    nums[i] =0;
                    position ++;
                }
            i++;
            }
        }

        
    }
}
