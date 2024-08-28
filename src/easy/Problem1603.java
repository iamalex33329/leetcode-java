package easy;

public class Problem1603 {

    class ParkingSystem {

        int[] slot;

        public ParkingSystem(int big, int medium, int small) {
            slot = new int[]{0, big, medium, small};
        }

        public boolean addCar(int carType) {
            return slot[carType]-- > 0;
        }
    }
}
