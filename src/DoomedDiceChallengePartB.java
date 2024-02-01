import java.util.Arrays;

public class DoomedDiceChallengePartB {

    public static int[] undoom_dice(int[] Die_A, int[] Die_B) {
        int[] New_Die_A = new int[Die_A.length];

        for (int i = 0; i < Die_A.length; i++) {
            New_Die_A[i] = Die_A[i];
        }

        for (int i = 0; i < New_Die_A.length; i++) {
            if (New_Die_A[i] > 4) {
                New_Die_A[i] = 4;
                int remainingSpots = Die_A[i] - 4;

                for (int j = 0; j < New_Die_A.length && remainingSpots > 0; j++) {
                    if (New_Die_A[j] < 4) {
                        int spotsToAdd = Math.min(remainingSpots, 4 - New_Die_A[j]);
                        New_Die_A[j] += spotsToAdd;
                        remainingSpots -= spotsToAdd;
                    }
                }
            }
        }

        return New_Die_A;
    }

    public static void main(String[] args) {
        int[] Die_A = {1, 2, 3, 4, 5, 6};
        int[] Die_B = {1, 2, 3, 4, 5, 6};

        int[] New_Die_A = undoom_dice(Die_A, Die_B);
        int[] New_Die_B = Die_B;

        System.out.println("New Die_A: " + Arrays.toString(New_Die_A));
        System.out.println("New Die_B: " + Arrays.toString(New_Die_B));
    }
}
