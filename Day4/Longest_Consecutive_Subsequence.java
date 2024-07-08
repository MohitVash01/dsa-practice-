import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int longest = 1;
        HashSet<Integer> hs = new HashSet<>();

        // Add all elements to the HashSet
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }

        // Iterate through the elements in the HashSet
        for (Integer it : hs) {
            // Check if it is the start of a sequence
            if (!hs.contains(it - 1)) {
                int cnt = 1;
                int x = it;

                // Count the length of the sequence
                while (hs.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }

                // Update the longest length found
                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}
