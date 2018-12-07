public class Paginator {
    private int smsLenght=30;
    public String[] paginate (String input)
    {

        char[] temp = input.toCharArray();
        int length = input.length();
        String[] output = new String[(int)(Math.ceil((double)length/(double)smsLenght))];
        int linha = 0;
        for (int i = 0; i <length ; i+= smsLenght) {
            output[linha] = new String(temp,i,Math.min(smsLenght,length-i));
            linha++;
        }
        return output;

    }
}
