class Solution {
    public int subarraySum(int[] ar, int k) {
        int count =0;
        int prefix_sum=0;
        HashMap<Integer, Integer> mapp = new HashMap<>();
        mapp.put(prefix_sum,1);
        for(int i=0;i<ar.length;i++)
        {
            prefix_sum+= ar[i];
            int remove = prefix_sum-k;
            if(mapp.containsKey(remove)) count+= mapp.getOrDefault(remove , 0);
            
            mapp.put(prefix_sum, mapp.getOrDefault(prefix_sum,0)+1);

        }
        return count;
    }
}
