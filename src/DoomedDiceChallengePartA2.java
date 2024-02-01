public class DoomedDiceChallengePartA2 {

    public static void main(String[] args) {
        // Step 1: Define the Dice
        int[] Die_A = {1, 2, 3, 4, 5, 6};
        int[] Die_B = {1, 2, 3, 4, 5, 6};

        // Step 2: Create a 6x6 Matrix and Calculate Sums
        int[][] sumDistribution = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                sumDistribution[i][j] = Die_A[i] + Die_B[j];
            }
        }

        // Step 3: Display Distribution
        System.out.println("Distribution of Sums:");
        for (int[] row : sumDistribution) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Count occurrences of each sum
        int[] sumCounts = new int[12];

        for (int[] row : sumDistribution) {
            for (int val : row) {
                sumCounts[val - 1]++;
            }
        }

        // Display the count of each sum
        System.out.println("\nSum Counts:");
        for (int i = 0; i < sumCounts.length; i++) {
            if (sumCounts[i] > 0) {
                System.out.println("Sum " + (i + 1) + ": " + sumCounts[i] + " times");
            }
        }
    }
}


