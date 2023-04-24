import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] scores = {3, 8, 1, 9, 4, 2, 7, 6, 5};
        int[] sortedScores = mergeSortDescending(scores);
        System.out.println(Arrays.toString(sortedScores));
    }

    public static int[] mergeSortDescending(int[] scores) {
        if (scores.length <= 1) {
            return scores;
        }

        int middle = scores.length / 2;
        int[] leftHalf = Arrays.copyOfRange(scores, 0, middle);
        int[] rightHalf = Arrays.copyOfRange(scores, middle, scores.length);

        int[] leftSorted = mergeSortDescending(leftHalf);
        int[] rightSorted = mergeSortDescending(rightHalf);

        return mergeDescending(leftSorted, rightSorted);
    }

    public static int[] mergeDescending(int[] leftHalf, int[] rightHalf) {
        int[] merged = new int[leftHalf.length + rightHalf.length];
        int i = 0, j = 0;

        for (int k = 0; k < merged.length; k++) {
            if (i >= leftHalf.length) {
                merged[k] = rightHalf[j];
                j++;
            } else if (j >= rightHalf.length) {
                merged[k] = leftHalf[i];
                i++;
            } else if (leftHalf[i] > rightHalf[j]) {
                merged[k] = leftHalf[i];
                i++;
            } else {
                merged[k] = rightHalf[j];
                j++;
            }
        }

        return merged;
    }
}
