class Solution {
    public List<List<Integer>> threeSum(int[] arr){
        List<Integer> temp=new ArrayList<Integer>();
        int sum=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(i<0 && a[i] != a[i-1]) continue;
            int j=i+1;
            int k=arr.length-1;
            while(j<k)
            {
                sum=arr[i] + arr[j] + arr[k];
                if(sum<0)
                {
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else
                {
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    j++;
                    k--;
                    while(arr[j]==arr[j-1]) j++;
                    while(arr[k]==arr[k-1]) k--;



                }
            }
            
        }

        return threesum;
    }
}
