package lotto;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Application {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String price = sc.nextLine();

        boolean numCheck = isDigit(price);

    }

    public static boolean isDigit(String number) {
        String pattern = "^[0-9]*$";
        return Pattern.matches(pattern, number);
    }
}
