import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Advent2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("cisla.txt");
        Scanner sc = new Scanner(file);
        ArrayList<Integer> nums = new ArrayList();
        while (sc.hasNextInt()) {
            nums.add(sc.nextInt());
        }
        System.out.println(nums.stream().mapToInt(i -> ((int) Math.floor(i / 3 - 2))).sum());
    }
}

