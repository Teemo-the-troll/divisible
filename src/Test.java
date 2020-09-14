import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static Integer max(ArrayList x) {
        return (Integer) Collections.max(x);
    }

    public static Integer min(ArrayList x) {
        return (Integer) Collections.min(x);
    }

    public static boolean isNum(String x) {
        if (x == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(x);
        } catch (NumberFormatException n) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList();
        String input = "";
        while (true) {
            System.out.println("please input number, or any non numerical character to exit");
            input = sc.nextLine();
            if (!isNum(input))
                break;
            else
                nums.add(Integer.parseInt(input));
        }
        int sum = 0;
        System.out.print("inputed numbers are: ");
        for (int number : nums) {
            sum = sum + number;
            System.out.print(number + ", ");
        }
        System.out.println();
        System.out.println("sum of the numbers is: " + sum);
        System.out.println("approximate average of the numbers is: " + (sum / nums.size()));
        System.out.println("highest number is: " + max(nums));
        System.out.println("lowest number is: " + min(nums));
    }
}
