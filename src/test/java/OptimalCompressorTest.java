import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OptimalCompressorTest {
    @Test
    public void  isCompressing(){
        OptimalCompressor compressor = new OptimalCompressor();
        String input = "Ala ma kota, Bartek ma psa, Ola ma aligatora, Przemek ma pytona, Konrad ma wilka, Ala spotkala sie z Przemkiem i kot  jej zaginal";
        char[] output = compressor.compress(input).toCharArray();
        assertTrue(output.length < input.toCharArray().length);
    }
    @Test
    public void isDecompressing(){
        OptimalCompressor compressor = new OptimalCompressor();
        String input = "Ala ma kota, Bartek ma psa, Ola ma aligatora, Przemek ma pytona, Konrad ma wilka, Ala spotkala sie z Przemkiem i kot  jej zaginal";
        String output = compressor.compress(input);
        output = compressor.decompress(output);
        assertTrue(output.equals(input));
    }
}
