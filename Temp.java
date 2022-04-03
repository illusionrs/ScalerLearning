import java.util.*;
public class Temp {

    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();

        if (B > A.size())
            return res;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < B; i++) {
            mp.put(A.get(i), mp.getOrDefault(A.get(i), 0) + 1);
        }

        for (int i = B; i < A.size(); i++) {
            
            res.add(mp.size());

            if (mp.get(A.get(i - B)).equals(1)) {
                mp.remove(A.get(i - B));
            } else {
                mp.put(A.get(i - B), mp.get(A.get(i - B)) - 1);
            }

            mp.put(A.get(i), mp.getOrDefault(A.get(i), 0) + 1);
        }

        res.add(mp.size());
        return res;
    }

    public static void main(String...args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(1);
        al.add(3);
        al.add(4);
        al.add(3);
        
       dNums(al, 3);
    }
    
}
