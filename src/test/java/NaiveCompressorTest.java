import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NaiveCompressorTest {



    @Test
    public void shortString (){
        String input = "Ala ma kota.";
        String expected = "AlaMaKota";
        assertEquals(expected, new NaiveCompressor().compress(input));
    }

    @Test
    public void numbersAndString (){
        String input = "Ala ma 3 koty i 2 psy.";
        String expected = "AlaMa3KotyI2Psy";
        assertEquals(expected, new NaiveCompressor().compress(input));
    }

    @Test
    public void nullTest(){
        String input = "";
        String expected = "";
        assertEquals(expected, new NaiveCompressor().compress(input));
    }

    @Test
    public void specialSigns(){
        String input = "Ala, ale Ona to dopiero ma rower, taki na wypasie.";
        String expected = "AlaAleOnaToDopieroMaRowerTakiNaWypasie";
        assertEquals(expected, new NaiveCompressor().compress(input));
    }

    @Test
    public void longString (){
        String input = "Ala ma kota, Bartek ma psa, Ola ma aligatora, Przemek ma pytona, Konrad ma wilka, Ala spotkala sie z Przemkiem i kot  jej zaginal";
        String expected= "AlaMaKotaBartekMaPsaOlaMaAligatoraPrzemekMaPytonaKonradMaWilkaAlaSpotkalaSieZPrzemkiemIKotJejZaginal";
        assertEquals(expected, new NaiveCompressor().compress(input));
    }

}

