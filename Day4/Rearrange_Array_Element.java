class Solution {
    public int[] rearrangeArray(int[] ar) {
         int pos = 0;
        int neg = 1;
        int temp [] = new int[ar.length];
        for(int i=0 ; i<ar.length ; i++)
        {
            if(ar[i] >0)
            {
                temp[pos] = ar[i];
                pos +=2;
            }
            else
            {
                temp[neg] = ar[i];
                neg+=2;
            }
        }
        return temp;
    }
}
