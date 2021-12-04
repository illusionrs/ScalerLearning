public class App {
    public static void main(String[] args) {
        ArmStrong armStrong = new ArmStrong();
        armStrong.Sol(200);
        PrefixSum prefixSum = new PrefixSum();
        int t=prefixSum.FindEquiValenceIndexForOddEven(new int[]{2,1,6,4});
        System.out.println(t);


    }

    
}
