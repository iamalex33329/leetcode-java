package easy;

public class Problem168 {

    public String convertToTitle(int columnNumber) {

        StringBuilder builder = new StringBuilder();

        while (columnNumber-- > 0) {
            builder.append(Character.toString(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }

        return builder.reverse().toString();
    }
}
