package easy;

public class Problem258 {

    public int addDigits(int num) {

        while (num >= 10) {
            int sum = 0;
            int round = num;
            while (round != 0) {
                sum += round % 10;
                round /= 10;
            }
            num = sum;
        }

        return num;
    }

    public int addDigits1(int num) {
        if (num == 0) return 0;
        else if (num % 9 == 0) return 9;
        return num % 9;
    }
}
