class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int count =0;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i] ==0)
            {
                count=0;
            }
            else
            {
                count ++;
                max = Math.max(max,  count);
            }
        }
        if(max == Integer.MIN_VALUE)
        {
            return 0;
        }
    return max;
        
    }
}
