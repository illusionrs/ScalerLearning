import java.util.function.Function;

import java.util.*;
public class SubarraySum {

    int findIndexRangeForK(ArrayList<Integer> A, int B){

        int n =A.size();
        int start=0;
        int curr_sum=A.get(0);
        int a=-1;
        int b=-1;

        for(int i=1;i<=n;i++){
          

            while(curr_sum>B && start<i-1){
                curr_sum=curr_sum-A.get(start);
                start++;
            }

            if(curr_sum==B)
            {
                a=start;
                b=i-1;
            }
            if(i<n)
            curr_sum+=A.get(i);



        }
        
        return 0;

    }
    
}
