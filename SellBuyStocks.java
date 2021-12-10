
public class SellBuyStocks {
    
    public int maxProfit(int[] stocks){

        int profit=0;
        int min=Integer.MAX_VALUE;
        int n = stocks.length;

        for(int i=0;i<n;i++){
            if(min>stocks[i]){
                min=stocks[i];
            }
            if(min<stocks[i] && (profit<(stocks[i]-min)))
            {
              profit=stocks[i]-min;
            }
        }
        return profit;
    }
}
