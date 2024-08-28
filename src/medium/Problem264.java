package medium;

public class Problem264 {

    public int nthUglyNumber(int n) {

        int[] un = new int[n];
        un[0] = 1;

        int i2 = 0, i3 = 0, i5 = 0;

        for (int i = 1; i < n; i++) {
            int nu = Math.min(un[i2] * 2, Math.min(un[i3] * 3, un[i5] * 5));
            un[i] = nu;

            if (nu == un[i2] * 2) i2++;
            if (nu == un[i3] * 3) i3++;
            if (nu == un[i5] * 5) i5++;
        }

        return un[n - 1];
    }
}
