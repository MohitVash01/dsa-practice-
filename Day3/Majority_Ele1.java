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
        int ele1 = Integer.MIN_VALUE; 
        int ele2 = Integer.MIN_VALUE ;
        int count1 = 0 ;
        int count2 = 0 ;
        List<Integer> ans = new ArrayList<>();
        for(int i=0 ; i<ar.length;i++)
        {
            if(count1==0 && ele2 != ar[i])
            {
                count1=1;
                ele1 = ar[i];
            }
            else if(count2==0 && ele1 != ar[i])
            {
                count2++;
                ele2 = ar[i];
            }
            else if(ele1 == ar[i]) count1++;
            else if(ele2 == ar[i]) count2++;
            else 
            {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i] == ele1) count1++;
            if(ar[i] == ele2) count2++;
        }
        if(count1> ar.length/3) ans.add(ele1);
        if(count2 > ar.length/3) ans.add(ele2);
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
