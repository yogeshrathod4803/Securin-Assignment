import java.util.ArrayList;

public class DoomedDiceChallengePartA1 {

    private static int calculateTotalCombinations(int[] dieA, int[] dieB) {
        ArrayList<Integer> possibleCombinations = new ArrayList<>();

        for (int i = 0; i < dieA.length; i++) {
            for (int j = 0; j < dieB.length; j++) {
                possibleCombinations.add(dieA[i] * 10 + dieB[j]);
            }
        }

        int totalCombinations = dieA.length * dieB.length;
        System.out.println("The total possible combinations are: " + possibleCombinations);
        return totalCombinations;
    }

    public static void main(String[] args) {
        int[] dieA = {1, 2, 3, 4, 5, 6};
        int[] dieB = {1, 2, 3, 4, 5, 6};

        int totalCombinations = calculateTotalCombinations(dieA, dieB);

        System.out.println("Total Combinations: " + totalCombinations);
    }
}
