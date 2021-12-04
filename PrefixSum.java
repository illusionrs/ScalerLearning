public class PrefixSum {

    public int FindEquiValenceIndexForOddEven(int[] A) {
        int n =A.length;

    int[] prefixSumEven = new int[n];
    int[] prefixSumOdd = new int[n];
    prefixSumEven[0]=A[0];
    prefixSumOdd[0]=0;


    for(int i=1;i<n;i++)
    {
     if(i%2==0){
         prefixSumEven[i]=prefixSumEven[i-1]+A[i];
         prefixSumOdd[i]=prefixSumOdd[i-1];
     }
     else{
         prefixSumEven[i]=prefixSumEven[i-1];
         prefixSumOdd[i]=prefixSumOdd[i-1]+A[i];
     }
    }
    int count=0;

    for(int i=0;i<n;i++){

        if(i==0){
        int sumEven= (prefixSumEven[n-1]-prefixSumEven[i]);
        int sumOdd = (prefixSumOdd[n-1]-prefixSumOdd[i]);
        

        if(sumEven==sumOdd)
        count++;
        }
        else if(i>0 && i<n-1){
            int sumEven= (prefixSumEven[i-1])+ (prefixSumOdd[n-1]-prefixSumOdd[i])
            ;
            int sumOdd =(prefixSumOdd[i-1]) + (prefixSumEven[n-1]-prefixSumEven[i]);
    
        if(sumEven==sumOdd)
        count++;
        }
        else{
        int sumEven= (prefixSumEven[n-2]);
        int sumOdd = (prefixSumOdd[n-2]);
        

        if(sumEven==sumOdd)
        count++;
        }

       
    }

    return count;
        }


 public int EquivalenceIndex(int[] A){
    int[] prefixSum = new int[A.length];
    prefixSum[0]=A[0];

    for(int i=1;i<A.length;i++){
        prefixSum[i]=prefixSum[i-1]+A[i];
    }
    
    for(int i=0;i<A.length-1;i++){

        if(i==0 && (prefixSum[i]-prefixSum[0])==(prefixSum[A.length-1]-prefixSum[i+1]))
        return i;

        else if(i!=0 && ((prefixSum[i-1]-prefixSum[0])==(prefixSum[A.length-1]-prefixSum[i+1])))
        return i;
    }
    return -1;
 }
    
}
