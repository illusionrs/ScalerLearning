public class App {
    public static void main(String[] args) {
        // ArmStrong armStrong = new ArmStrong();
        // armStrong.Sol(200);
        // PrefixSum prefixSum = new PrefixSum();
        // int t=prefixSum.FindEquiValenceIndexForOddEven(new int[]{2,1,6,4});
        // System.out.println(t);
        //prefixSum.rangeSum(new int[]{1,2,3,4,5}, new int[][]{{1, 4}, {2, 3}});
        // SubArray subArray = new SubArray();
        // subArray.LeasAverage(new int[]{3, 7, 90, 20, 10, 50, 40}, 3);

        SellBuyStocks sellBuyStocks = new SellBuyStocks();
       int a= sellBuyStocks.maxProfit(new int[]{7,1,5,3,6,4});
       System.out.println(a);




    }

    
}
