package DAY2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mergeintervals{
    class Solution {
    public int[][] merge(int[][] arr) {
        int n = arr.length; // size of the array
        // sort the given intervals:
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();
        // [1,3],
        //              [2,6],
        // [8,10],
        // [15,18]
        //ans=             [1,3]

        for (int i = 0; i < n; i++) {
            // if the current interval does not
            // lie in the last interval:
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            // if the current interval
            // lies in the last interval:
            else {
             ans.get(ans.size()-1).set(1,Math.max(arr[i][1],ans.get(ans.size()-1).get(1)));















                // ans.get(ans.size() - 1).set(1,Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
                //last row ke 1 index ko   set=> change
            }
        }
        int rows = ans.size();
        int cols = ans.get(0).size();
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = ans.get(i).get(j);
            }
        }
        return array;

    }
}
    
}
