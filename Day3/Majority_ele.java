package Day3;

public class Majority_ele {
        public int majorityElement(int[] a) {
            int count=0;
            int ele=0;
            for(int i=0;i<a.length;i++)
            {
                if(count==0)
                {
                    count=1;
                    ele=a[i];
                }
                else if(a[i]==ele)
                {
                    count++;
                }
                else
                {
                    count--;
                }
            }
            
            int count1=0;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==ele)
                {
                    count1++;
                }
                if(count1>(a.length/2))
                {
                    return ele;
                }
            }
            return count;
        }
    }
