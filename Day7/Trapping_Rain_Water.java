class Solution {
    public int trap(int[] height) {
        int L = 0 ;
        int R = height.length-1;
        int Lwall = height[0];
        int Rwall = height[height.length-1];
        int totalpaani = 0;
        while( L<=R)
        {
            if(Lwall <= Rwall)
            {
                Lwall = Math.max(Lwall , height[L]);
                totalpaani  = totalpaani +Lwall - height[L];
                L++;
            }
            else 
            {
                Rwall = Math.max(Rwall , height[R]);
                totalpaani = totalpaani + Rwall - height[R];
                R--;
            }
        
        }
    return totalpaani;
        
    }
}
