package lotto;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Application {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String price = sc.nextLine();

        boolean numCheck = isDigit(price);
        if (numCheck) {
            boolean valueCheck = isValuesInThousands(price);
        }

    }

    public static boolean isDigit(String number) {
        String pattern = "^[0-9]*$";
        return Pattern.matches(pattern, number);
    }

    public static boolean isValuesInThousands(String price) {
        int num = Integer.parseInt(price);
        if ((num % 1000) == 0)
            return true;
        return false;
    }

}
