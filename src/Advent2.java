import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Advent2 {
    static int getFuel(int fuel) {
    return ( (int) Math.floor(fuel / 3 - 2));
    }

    public static void main(String[] args) {
        File file = new File("cisla.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int finalAmount = 0;
        int fuel = 0;
        while (sc.hasNextInt()){
            fuel = getFuel(sc.nextInt());
            while (getFuel(fuel) != 0) {
                fuel += getFuel(fuel);
            }
            finalAmount += fuel;
            fuel = 0

        }
        System.out.println(finalAmount);
        }
    }

