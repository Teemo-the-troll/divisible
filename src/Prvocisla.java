import java.util.ArrayList;

public class Prvocisla {

    public static void main(String[] args) {
        ArrayList<Integer> prvocisla = new ArrayList<Integer>(); // array na cisla
        boolean isPrime;
        for (int i = 1; i < 100 ; i++) { //100*
            prvocisla.add(i);
            isPrime = true;
            for (Integer num: prvocisla) {
                if (i != num && i % num == 0 && num != 1) {
                    isPrime = false;
                    break;}
            }
            if (!isPrime)
                prvocisla.remove(prvocisla.size() - 1);
        }
        for (Integer num: prvocisla)
                System.out.println(num);
    }
}
