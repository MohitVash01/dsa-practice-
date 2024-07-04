package DAY2;

import java.util.ArrayList;
import java.util.List;

public class repeat_and_missing {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        long n=A.size();
        long SN=(n*(n+1)/2);
        long S2N=(n*(n+1)*(2*n+1))/6;
        long S = 0;  // Initialize sum of elements in A
        long S2 = 0;
        
        for(int i=0;i<n;i++)
        {
            S +=A.get(i);
            S2 +=(long)A.get(i)* (long)A.get(i);
        }
    long val1=S-SN;
    long val2=S2-S2N;
    val2=val2/val1;
    long x=(val1+val2)/2;
    long y=x-val1;
    ArrayList<Integer> result =new ArrayList<>();
    result.add((int) x);
    result.add((int) y);
    
    return result;
    }
    
}
 
