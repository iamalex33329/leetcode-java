package easy;

public class Problem1945 {

    public int getLucky(String s, int k) {
        StringBuilder total = new StringBuilder();
        for (Character c : s.toCharArray()) total.append(c - 'a' + 1);

        String result = total.toString();

        for (int i = 1; i <= k; i++) {
            int lucky = 0;

            for (Character c : result.toCharArray()) lucky += c - '0';
            result = String.valueOf(lucky);
        }
        return Integer.parseInt(result);
    }

    public int getLucky2(String s, int k) {
        int sum = 0;
        for (int i=0; i<s.length(); i++) {
            int temp = s.charAt(i) - 'a' + 1;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
        }

        k--;

        int num = sum;
        while (k > 0) {
            sum = 0;
            int temp = num;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
            num = sum;
            k--;
        }
        return sum;
    }
}
