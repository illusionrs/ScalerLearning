public class SubArray {
    
    /**
     * Return least average first index of length B
     * @param A
     * @param B
     * @return int
     */
    public int LeasAverage(int[] A, int B){
        int[] prefixSum= new int[A.length];
        prefixSum[0]=A[0];
        int n=A.length;
        int average=Integer.MAX_VALUE;
        int index=-1;

        for(int i=1;i<B;i++){
            prefixSum[i]=prefixSum[i-1]+A[i];
        }
        for(int i=B-1;i<n;i++){
            int least=0;
            if(i-B+1==0)
            {
                least=prefixSum[i];
            }
            else {
                least=prefixSum[i]-prefixSum[i-B];
            }

            int tempAverage=least/B;
            if(tempAverage<average)
            {
                
                average=tempAverage;
                index=i-B+1;

            }
            

        }
        return index;
    }

    public int maxSubarraySumLessThanK(int A, int B, int[] C) {
        int n=A;
        int[] prefixSum = new int[n];
        prefixSum[0]=C[0];

        for(int i=1;i<C.length;i++)
        prefixSum[i]=prefixSum[i-1]+C[i];

        int maxSum=0;

        for(int i=0;i<n;i++){
            if(i==0 && prefixSum[i]<=B){
                maxSum=Math.max(maxSum,prefixSum[i]);
                continue;
            }
            if(i==0)
            continue;

            if(prefixSum[i]<=B){
                maxSum=Math.max(prefixSum[i],maxSum);
            }
            if((prefixSum[n-1]-prefixSum[i-1])<=B)
            maxSum=Math.max(maxSum,prefixSum[n-1]-prefixSum[i-1]);

            
        }
        

        return maxSum;
    }
}
