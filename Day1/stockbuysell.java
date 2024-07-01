package Day1;

public class stockbuysell {
    class Solution {
        public int maxProfit(int[] arr) {
            int max_P=0;
            int buy=arr[0];
            for(int i=1;i<arr.length;i++)
            {
                int sell=arr[i];
                int profit=sell-buy;
                max_P=Math.max(max_P,profit);
    
                buy=Math.min(buy,arr[i]);
            }
            return max_P;
        }
    }
    
}
