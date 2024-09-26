package easy;

public class Problem3280 {

    public String convertDateToBinary(String date) {
        int yyyy = Integer.parseInt(date.substring(0, 4));
        int mm = Integer.parseInt(date.substring(5, 7));
        int dd = Integer.parseInt(date.substring(8, 10));

        return decimalToBinary(yyyy) + "-" + decimalToBinary(mm) + "-" + decimalToBinary(dd);
    }

    private String decimalToBinary(int decimal) {

        StringBuilder binary = new StringBuilder();

        while (decimal > 1) {
            binary.insert(0, (decimal % 2));
            decimal /= 2;
        }
        binary.insert(0, (decimal % 2));

        return binary.toString();
    }
}
