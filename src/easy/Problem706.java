package easy;

import java.util.Arrays;

public class Problem706 {

    class MyHashMap {

        private long[] map;

        private final long size = 100000;
        private final long mul = 1439;

        public MyHashMap() {
            map = new long[(int) size];
            Arrays.fill(map, -1);
        }

        private int hash(int key) {
            return (int) ((key * mul) % size);
        }

        public void put(int key, int value) { map[hash(key)] = value; }

        public int get(int key) { return (int) map[hash(key)]; }

        public void remove(int key) { map[hash(key)] = -1; }
    }
}
