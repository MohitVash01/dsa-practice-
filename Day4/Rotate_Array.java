class Solution {
    public void rotate(int[] nums, int k) {
        nums = reverse(nums , 0 , nums.length-1);
        if(k > nums.length)
        {
            k = k%nums.length;
        }
        
        nums = reverse(nums , k , nums.length-1); 
        nums = reverse(nums , 0 , k-1);
         

        
    }
    static int[] reverse(int nums[] , int begin , int end)
    {
        while(begin<end)
        {
            int a = nums[begin];
            nums[begin] = nums[end];
            nums[end] = a;
            begin++;
            end--;
        }
    return nums;
    }
}
