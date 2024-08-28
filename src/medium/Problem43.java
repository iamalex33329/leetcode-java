package medium;

public class Problem43 {

    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) return "0";

        int[] mul = new int[num1.length() + num2.length()];

        for (int i=0; i<num1.length(); i++) {
            for (int j=0; j<num2.length(); j++) {
                mul[i+j+1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }

        for (int i=mul.length-1; i>0; i--) {
            mul[i-1] += mul[i] / 10;
            mul[i] %= 10;
        }

        StringBuilder result = new StringBuilder();
        for (int i=0; i<mul.length; i++) {
            if (!(mul[i] == 0 && i == 0)) {
                result.append(mul[i]);
            }
        }

        return result.toString();
    }
}
