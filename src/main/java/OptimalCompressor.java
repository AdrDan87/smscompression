import com.github.icedrake.jsmaz.Smaz;

import java.nio.charset.StandardCharsets;

public class OptimalCompressor implements Compressor {
    @Override
    public String compress(String input) {
        Smaz smaz = new Smaz();
        byte[] compressed = smaz.compress(input);
        return new String(compressed, StandardCharsets.ISO_8859_1);
    }

    @Override
    public String decompress(String input) {
        Smaz smaz = new Smaz();
        byte[] b = input.getBytes(StandardCharsets.ISO_8859_1);
        return smaz.decompress(b);
    }
}
