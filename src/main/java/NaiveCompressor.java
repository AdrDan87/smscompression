public class NaiveCompressor implements Compressor{
    @Override
    public String compress(String input) {
        StringBuffer s = new StringBuffer();
        char ch = ' ';
        for (int i = 0; i < input.length(); i++) {
            if (ch == ' ' && input.charAt(i) != ' '){
                s.append(Character.toUpperCase(input.charAt(i)));
            }else {
                s.append(input.charAt(i));
            }
            ch = input.charAt(i);
        }
        return s.toString().replaceAll("\\W","");
    }

    @Override
    public String decompress(String input) {
       String output = input.replaceAll("(.)([A-Z0-9])", "$1 $2");
       return output;
    }
}
