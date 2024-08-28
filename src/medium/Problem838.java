package medium;

public class Problem838 {

    public String pushDominoes(String dominoes) {

        char[] dominoesArray = dominoes.toCharArray();
        int[] forces = new int[dominoes.length()];

        int force = 0;
        // 計算向右 R 的力
        for (int i = 0; i < dominoes.length(); i++) {
            if (dominoesArray[i] == 'R') force = dominoes.length();
            else if (dominoesArray[i] == 'L') force = 0;
            else force = Math.max(force - 1, 0);
            forces[i] += force;
        }

        // 計算向左 L 的力
        force = 0;
        for (int i = dominoes.length() - 1; i >= 0; i--) {
            if (dominoesArray[i] == 'L') force = dominoes.length();
            else if (dominoesArray[i] == 'R') force = 0;
            else force = Math.max(force - 1, 0);
            forces[i] -= force;
        }

        // 根據力的結果決定每個骨牌的方向
        StringBuilder result = new StringBuilder();
        for (int f : forces) {
            if (f == 0) result.append('.');
            else result.append(f > 0 ? 'R' : 'L');
        }

        return result.toString();
    }
}
