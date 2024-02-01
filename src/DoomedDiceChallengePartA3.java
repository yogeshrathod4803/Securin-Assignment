public class DoomedDiceChallengePartA3 {

    public static void main(String[] args) {
        int[] dieA = {1, 2, 3, 4, 5, 6};
        int[] dieB = {1, 2, 3, 4, 5, 6};

        int totalCombinations = dieA.length * dieB.length;

        for (int sum = 2; sum <= 12; sum++) {
            int combinations = countCombinations(dieA, dieB, sum);

            int numerator = combinations;
            int denominator = totalCombinations;

            System.out.println("The probability for the sum " + sum +" occurrence is:\n" +
                    "P(Sum = " + sum + ") = " + numerator + "/" + denominator);
        }
    }

    private static int countCombinations(int[] dieA, int[] dieB, int targetSum) {
        int count = 0;

        for (int faceA : dieA) {
            for (int faceB : dieB) {
                if (faceA + faceB == targetSum) {
                    count++;
                }
            }
        }

        return count;
    }
}


