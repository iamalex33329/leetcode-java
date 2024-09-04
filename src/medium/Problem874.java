package medium;

import java.util.HashSet;


public class Problem874 {

    public int robotSim(int[] commands, int[][] obstacles) {

        HashSet<Integer> obstacleSet = new HashSet<>();
        int offset = 16127;
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] * offset + obstacle[1]);
        }

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int x = 0, y = 0;
        int direction = 0; // 0: North, 1: East, 2: South, 3: West
        int maxDistance = 0;

        for (int command : commands) {
            if (command == -1) {
                direction = (direction + 1) % 4;
            } else if (command == -2) {
                direction = (direction + 3) % 4;
            } else {
                for (int i=0; i<command; i++) {
                    int nextX = x + directions[direction][0];
                    int nextY = y + directions[direction][1];

                    if (obstacleSet.contains(nextX * offset + nextY)) break;

                    x = nextX;
                    y = nextY;

                    maxDistance = Math.max(maxDistance, x * x + y * y);
                }
            }
        }
        return maxDistance;
    }
}
