class Solution {
    public int longestConsecutive(int[] nums) {
       int ans= 0;
       Set<Integer> set = new HashSet<>(); // Unordered Set
       for(int ele : nums)
       {
            set.add(ele);
       }
       for(int ele : set)
       {
        // if previous is not present then it is a starting point
            if(!set.contains(ele-1))
            {
                int count = 1;
                int num = ele; 
                while(set.contains(num+1))
                {
                    count ++ ;
                    num ++;
                }
            ans = Math.max(ans , count);
            }
       }
    return ans;
    }
}
