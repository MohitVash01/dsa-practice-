class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[nums.length -1]  != nums[nums.length-2]) return nums[nums.length-1];
        int low = 1 ; 
        int high = nums.length -2;
        while(low <= high)
        {
             int mid = (low + high) / 2;

            // If arr[mid] is the single element:
            if (nums[mid] != nums[mid+1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }

            // We are in the left:
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1])
                    || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                // Eliminate the left half:
                low = mid + 1;
            }
            // We are in the right:
            else {
                // Eliminate the right half:
                high = mid - 1;
            }
        }
        return -1;
    }
}
