import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {

//Mając listę liczb i liczbę k, zwróć, czy dowolne dwie liczby z listy sumują się do k.
//Na przykład, biorąc pod uwagę [10, 15, 3, 7] i k z 17, zwróć prawdę, ponieważ 10 + 7 to 17.

    public static boolean isSum (List<Integer> numList, int number) {
        for (int i = 0; i < numList.size(); i++) {
            int k = numList.get(i);
            for (int j = i+1; j < numList.size(); j++) {
                int m = numList.get(j);
                if (k + m == number) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        List<Integer> numbList = new ArrayList<>();
        numbList.add(10);
        numbList.add(15);
        numbList.add(3);
        numbList.add(7);
        int k = 17;
        System.out.println(isSum(numbList, k)); // Wyjście: true (10 + 7 = 17)
    }
}
