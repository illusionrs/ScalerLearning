import java.util.*;
public class BitCompression {
    public int compressBits(ArrayList<Integer> A) {

        for(int i=1;i<A.size();i++){
            for(int j=i-1;j>=0;j--)
            {
                int t=A.get(i);
                A.add(i,A.get(i)&A.get(j));
                A.add(j,t|A.get(j));
            }
        }

        int res=A.get(0);
        for(int i=1;i<A.size();i++)
        {
           res=res|A.get(i);
        }
        

        return res;
    }
    
}
