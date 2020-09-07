import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Advent {
    public static void main(String[] args) {
        File file = new File("cisla.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int finalAmount = 0;
        while (sc.hasNextInt()){
            finalAmount += ((int) Math.floor(sc.nextInt() / 3 - 2));
        }
        System.out.println(finalAmount);
    }
}
