package DAY2;
public class Rotate_Image{
    public void rotate(int[][] a) {
        a=transpose(a);
        for(int row=0;row<a.length;row++)
        {
            for(int col=0;col<a[0].length/2;col++)
            
            {
                int temp=a[row][col];
                a[row][col]=a[row][a[0].length-col-1];
                a[row][a[0].length-col-1]=temp;

            }
        }


        
    }
    public static int[][] transpose(int[][] a){
        for(int row=0;row<a.length;row++)
        {
            for(int col=row;col<a[0].length;col++)
            {
                int temp=a[row][col];
                a[row][col]=a[col][row];
                a[col][row]=temp;
            }
        }
        return a;

    }
    public static void main(String[] args) {
        
    }
}