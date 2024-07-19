class Solution {
    public int missingNumber(int[] nums) {
        int total_sum = (nums.length * (nums.length +1 ))/2;
        int sum = 0 ;
        for (int  ele : nums)
        {
            sum += ele;
        }
            
    return total_sum - sum;    
    }
}
