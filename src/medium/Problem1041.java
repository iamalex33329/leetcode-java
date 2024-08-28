package medium;

public class Problem1041 {

    public boolean isRobotBounded(String instructions) {

        //                                 UP   RIGHT   DOWN    LEFT
        int[][] directions = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
        int x = 0, y = 0, dir = 0;

        for (char i : instructions.toCharArray()) {
            if (i == 'L') dir = (dir + 3) % 4;
            else if (i == 'R') dir = (dir + 1) % 4;

            else {
                x += directions[dir][0];
                y += directions[dir][1];
            }
        }

        return (x == 0 && y == 0) || dir != 0;
    }
}
