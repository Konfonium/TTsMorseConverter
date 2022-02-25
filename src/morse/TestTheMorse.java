package morse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTheMorse {

    //E -> *
    @Test
    public void testEtoStar() {
        MorseConverter converter = new MorseConverter();
        String testdata = "E";
        String expected = "*";
        String actual = converter.getMorse(testdata);

        assertEquals(expected, actual);
        System.out.println("Test E to Star: " + actual);

    }


    //* -> E
    @Test
    public void testStartoE() {
        MorseConverter converter = new MorseConverter();
        String testdata = "*";
        String expected = "E";
        String actual = converter.getMorse(testdata);

        assertEquals(expected, actual);
        System.out.println("test star to E: " + actual);
    }

    //A -> -*
    @Test
    public void testAtoStarDash() {
        MorseConverter converter = new MorseConverter();
        String testdata = "A";
        String expected = "*-";
        String actual = converter.getMorse(testdata);

        assertEquals(expected, actual);
        System.out.println("test A to StarDash: " + actual);
    }

    //& -> error
    @Test
    public void testAndToError() {
        MorseConverter converter = new MorseConverter();
        String testdata = "&";
        String expected = "Not my kind of sign";
        String actual = converter.getMorse(testdata);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    //e -> *
    @Test
    public void testSmallEtoStar() {
        MorseConverter converter = new MorseConverter();
        String testdata = "e";
        String expected = "*";
        String actual = converter.getMorse(testdata);

        assertEquals(expected, actual);
        System.out.println("lowercase E fixed to morse with .toUpperCase: "+ actual);
    }

    /*@Test
    public void testHelloToMorse() {
        MorseConverter converter = new MorseConverter();
        String testdata = "Hello";
        String expected = "******-***-**---";
        String actual = converter.getMorse(testdata);

        assertEquals(expected, actual);
    }*/
}
