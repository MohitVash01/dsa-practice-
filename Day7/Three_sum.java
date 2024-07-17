import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] ar) {
        Arrays.sort(ar);
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int i = 0; i < ar.length - 2; i++) {
            if (i > 0 && ar[i] == ar[i - 1]) continue;  // Skip duplicates for i
            
            int j = i + 1;
            int k = ar.length - 1;
            
            while (j < k) {
                int sum = ar[i] + ar[j] + ar[k];
                
                if (sum == 0) {
                    ans.add(Arrays.asList(ar[i], ar[j], ar[k]));
                    
                    // Skip duplicates for j
                    while (j < k && ar[j] == ar[j + 1]) j++;
                    // Skip duplicates for k
                    while (j < k && ar[k] == ar[k - 1]) k--;
                    
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        
        return ans;
    }
}
