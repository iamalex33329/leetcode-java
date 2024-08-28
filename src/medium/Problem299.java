package medium;

public class Problem299 {

    public String getHint(String secret, String guess) {
        int[] freq = new int[10];
        int bulls = 0, cows = 0;

        for (int i = 0; i < secret.length(); i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';

            if (s == g) {
                bulls++;
            } else {
                if (freq[s] < 0) cows++;
                if (freq[g] > 0) cows++;

                freq[s]++;
                freq[g]--;
            }
        }

        return bulls + "A" + cows + "B";
    }
}