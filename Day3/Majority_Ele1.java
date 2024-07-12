import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practise
{
    public static void main(String[] args) {
        int ar[] = {0,0,0};
        Optimal(ar);
    }
    // TC : O(N) + O(N)
    // SC: No space used for solving problem
    static void Optimal(int ar[])
    {
        class Solution {
    public List<Integer> majorityElement(int[] arr) {

        int cnt1 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cnt1 == 0 && arr[i] != ele2) {
                cnt1 = 1;
                ele1 = arr[i];
            } else if (cnt2 == 0 && arr[i] != ele1) {
                cnt2 = 1;
                ele2 = arr[i];
            } else if (ele1 == arr[i])
                cnt1++;
            else if (ele2 == arr[i])
                cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (ele1 == arr[i])
                cnt1++;
            if (ele2 == arr[i])
                cnt2++;
        }

        int mini =(arr.length / 3) + 1;
        if (cnt1 >= mini)
            ans.add(ele1);
        if (cnt2 >= mini)
            ans.add(ele2);
        return ans;

    
    display(ans);
    }
    // TC : O(N) -> Adding in HashMap  O(N) -> Traversing the HashMap to find majority element
    // SC: O(N) -> used a hashmap in solving the problem
    static void better(int ar[])
    {
        List<Integer> mylist = new ArrayList<>();
        HashMap<Integer, Integer> mapp = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (mapp.containsKey(ar[i])) {
                int count = mapp.get(ar[i]) + 1;
                mapp.put(ar[i], count);
            } else {
                mapp.put(ar[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : mapp.entrySet()) {
            int count =  entry.getValue();
            if(count > ar.length/3)
                mylist.add(entry.getKey());
        }
    display(mylist);    
    }
    // TC: O(N square) SC: O(1) no space used for finding solution 
    static void bruteForce(int ar[])
    {
        int  n =ar.length;
        List<Integer> mylist = new ArrayList<>();
        for(int i=0 ; i<n ; i++)
        {
            if(!mylist.contains(ar[i]))
            {
                int count = 0;
                for(int j=0 ; j<n ; j++)
                {
                    if(ar[i] == ar[j]) count++;
                }
                if(count > n/3 )
                mylist.add(ar[i]);
            }
            if(mylist.size() == 2) break;
        }
        display(mylist);
    }
    static void display(List<Integer> ans)
    {
        System.out.print("{ ");
        for(Integer ele : ans)
        {
            System.out.print(ele + "  ");
        }
        System.out.println("}");
    }
}
