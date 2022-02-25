package morse;

import java.util.HashMap;
import java.util.Locale;

public class MorseConverter {


    private HashMap<String, String> engAndMorse;

    public MorseConverter() {

        engAndMorse = new HashMap<>();
        engAndMorse.put("A", "*-");
        engAndMorse.put("B", "-***");
        engAndMorse.put("C", "-*-");
        engAndMorse.put("D", "-**");
        engAndMorse.put("E", "*");
        engAndMorse.put("F", "**-*");
        engAndMorse.put("G", "--*");
        engAndMorse.put("H", "****");
        engAndMorse.put("I", "**");
        engAndMorse.put("J", "*---");
        engAndMorse.put("K", "-*");
        engAndMorse.put("L", "*-**");
        engAndMorse.put("M", "--");
        engAndMorse.put("N", "-*");
        engAndMorse.put("O", "---");
        engAndMorse.put("P", "*--*");
        engAndMorse.put("Q", "--*-");
        engAndMorse.put("R", "*-*");
        engAndMorse.put("S", "***");
        engAndMorse.put("T", "-");
        engAndMorse.put("U", "**-");
        engAndMorse.put("V", "***-");
        engAndMorse.put("W", "*--");
        engAndMorse.put("X", "-**-");
        engAndMorse.put("Y", "-*--");
        engAndMorse.put("Z", "--**");
        engAndMorse.put("1", "*----");
        engAndMorse.put("2", "**---");
        engAndMorse.put("3", "***--");
        engAndMorse.put("4", "****-");
        engAndMorse.put("5", "*****");
        engAndMorse.put("6", "-****");
        engAndMorse.put("7", "--***");
        engAndMorse.put("8", "---**");
        engAndMorse.put("9", "----*");
        engAndMorse.put("0", "-----");
        engAndMorse.put("*-", "A");
        engAndMorse.put("-***", "B");
        engAndMorse.put("-*-", "C");
        engAndMorse.put("-**", "D");
        engAndMorse.put("*", "E");
        engAndMorse.put("**-*", "F");
        engAndMorse.put("--*", "G");
        engAndMorse.put("****", "H");
        engAndMorse.put("**", "I");
        engAndMorse.put("'---", "J");
        engAndMorse.put("-*", "K");
        engAndMorse.put("*-**", "L");
        engAndMorse.put("--", "M");
        engAndMorse.put("-'", "N");
        engAndMorse.put("---", "O");
        engAndMorse.put("*--*", "P");
        engAndMorse.put("--*-", "Q");
        engAndMorse.put("*-*", "R");
        engAndMorse.put("***", "S");
        engAndMorse.put("-", "T");
        engAndMorse.put("**-", "U");
        engAndMorse.put("***-", "V");
        engAndMorse.put("*--", "W");
        engAndMorse.put("-**-", "X");
        engAndMorse.put("-*--", "Y");
        engAndMorse.put("--**", "Z");
        engAndMorse.put("*----", "1");
        engAndMorse.put("**---", "2");
        engAndMorse.put("***--", "3");
        engAndMorse.put("****-", "4");
        engAndMorse.put("*****", "5");
        engAndMorse.put("-****", "6");
        engAndMorse.put("--***", "7");
        engAndMorse.put("---**", "8");
        engAndMorse.put("----*", "9");
        engAndMorse.put("-----", "0");


    }

    public String getMorse(String testdata) {
     //   String testdata.split(" ");
        String sign = engAndMorse.get(testdata.toUpperCase(Locale.ROOT));


        if (sign == null) {
            sign = "Not my kind of sign";


            // for (int i = 0; i < engAndMorse.size(); i++) {            }
        }
        return sign;
    }
}
