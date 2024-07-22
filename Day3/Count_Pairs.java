import java.util.*;
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int i =0 ; 
        int j = nums.size() - 1;
        int count =0;
        while(i<nums.size())
        {
            int k = i+1;
            while(k<nums.size())
            {
                if(nums.get(i) + nums.get(k)< target)
                {
                    count++;
                }
                k++;
            }
            i++;
        }
    return count;
        
        
    }
}
