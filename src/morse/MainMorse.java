package morse;

import java.util.Scanner;

public class MainMorse {

    public static void main(String[] args) {
        MorseConverter converter = new MorseConverter();
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String actual = converter.getMorse(text);
        System.out.println(actual);


    }
}
