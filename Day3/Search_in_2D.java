package Day3;

public class Search_in_2D {
    public boolean searchMatrix(int[][] a, int target) {
        int n=a.length;
        int m=a[0].length;
        int left=0;
        int right=(n*m)-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            int row=mid/m;
            int col=mid%m;
            if(a[row][col]==target)
            {
                return true;
            }
            else if(a[row][col]<target)
            {
                left= mid + 1;
            }
            else 
            {
                right=mid -1;
            }
        }
        return false;
        
    }
}

