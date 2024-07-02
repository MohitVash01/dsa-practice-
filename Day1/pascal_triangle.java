import java.util.ArrayList;
import java.util.List;

public class pascal_triangle {
    public List<List<Integer>> generate(int row) {
        List<List<Integer>> myLL = new ArrayList<>();
        for(int i=1;i<=row;i++)
        {
            List<Integer> temp=new ArrayList<>();
            int ans=1;
            temp.add(1);
            for(int col=1;col<i;col++)
            {
                ans=ans*(i-col);
                ans=ans/col;

                temp.add(ans);
            }
            myLL.add(temp);
        }
        return myLL;
    }
}

