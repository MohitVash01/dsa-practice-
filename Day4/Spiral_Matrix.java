class Solution {
    public List<Integer> spiralOrder(int[][] ar) {
        List<Integer> ans = new ArrayList<>();
        int Top = 0;
        int Bottom = ar.length-1;
        int Left = 0 ;
        int Right = ar[0].length-1;
        while(Top <=Bottom && Left<=Right)
        {
            for(int i=Left ; i<=Right ; i++)
            {
                ans.add(ar[Top][i]);
            }
            Top++;
            for(int i=Top ; i<=Bottom ; i++)
            {
                ans.add(ar[i][Right]);
            }
            Right--;
            if(Top<=Bottom)
            {
                for (int i = Right; i >= Left; i--)
                    ans.add(ar[Bottom][i]);

                Bottom--;
            }
            if(Left <= Right)
            {
                for(int i=Bottom ; i>=Top; i--)
                {
                    ans.add(ar[i][Left]);
                }
                Left++;
            }

        }

        return ans;
    }
}
