public class DoomedDiceChallengePartA2 {

    public static void main(String[] args) {

        int[] Die_A = {1, 2, 3, 4, 5, 6};
        int[] Die_B = {1, 2, 3, 4, 5, 6};

        int[][] sumDistribution = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                sumDistribution[i][j] = Die_A[i] + Die_B[j];
            }
        }

        System.out.println("Distribution of Sums:");
        for (int[] row : sumDistribution) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        int[] sumCounts = new int[12];

        for (int[] row : sumDistribution) {
            for (int val : row) {
                sumCounts[val - 1]++;
            }
        }

        System.out.println("\nSum Counts:");
        for (int i = 0; i < sumCounts.length; i++) {
            if (sumCounts[i] > 0) {
                System.out.println("Sum " + (i + 1) + ": " + sumCounts[i] + " times");
            }
        }
    }
}


