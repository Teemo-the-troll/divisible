import java.util.Scanner;

public class Divisible {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the number you want to divide");
        int number = sc.nextInt();
        System.out.println("input the number you want to divide it with");
        int delitel = sc.nextInt();
        if ((number % delitel) == 0)
            System.out.println("number " + number + " is divisible by " + delitel);
         else
            System.out.println("number " + number + " is NOT divisible by " + delitel);

    }
}
