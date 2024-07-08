package Day 4;

public class long {
    class Solution {
        public int longestConsecutive(int[] arr) {
            int n=arr.length;
            if(n==0) return 0;
            int longest=1;
            HashSet<Integer> hs=new HashSet<>();
            for(int i=0;i<arr.length;i++){
                hs.add(arr[i]);
            }
            for(Integer it: hs)
            {
                if(hs.contains(it-1) == hs.hasNext())
                {
                    int cnt=1;
                    int x=it;
                    while(hs.contains(x+1) != hs.hasNext())
                    {
                        x=x+1;
                        cnt=cnt+1;
                    }
                    longest=Math.max(longest,cnt);
                }
            }
            return longest;
        }
    }
    
}
