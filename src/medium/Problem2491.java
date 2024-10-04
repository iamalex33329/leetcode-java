package medium;

import java.util.Arrays;


public class Problem2491 {

    public long dividePlayers(int[] skill) {
        if (skill.length == 2) return (long) skill[0] * skill[1];

        int skillSum = 0;
        for (int s : skill) skillSum += s;

        int targetSkill = skillSum / (skill.length / 2);

        Arrays.sort(skill);
        long result = 0;

        int left = 0;
        int right = skill.length - 1;

        while (left < right) {
            if (skill[left] + skill[right] != targetSkill) return -1;
            result += (long) skill[left++] * skill[right--];
        }
        return result;
    }
}
