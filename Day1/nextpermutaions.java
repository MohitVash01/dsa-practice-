import java.util.Arrays;
class nextPermutation{
    public void nextPerm(int[] a) {// tu naam ko vhi apni marzi se daal sakta hai acha ok 
        int ind=-1;
        for(int i=a.length-2;i>=0;i--)
        {
            if(a[i]<a[i+1])
            {
                ind=i;
                break;
            }
        }
        if(ind==-1)
        {
            Arrays.sort(a);
            return;
        }
        for(int i=a.length-1;i>=ind;i--)//yaaha pe next greater element se replace karna hai (ind) ki value ko
        {  
            if(a[i]>a[ind])
            {
                int temp=a[i];
                a[i]=a[ind];
                a[ind]=temp;
                break;
            }

        }
        //yaha pe reverse ya sort karna hai ind+1 to end()tak ke index me 3 step hai yaad kar le 
        Arrays.sort(a,(ind+1),(a.length));
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        
    }
            
}
