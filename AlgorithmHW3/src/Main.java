public class Main {
    public static void main(String[] args) {

        int[] A = {100, 112, 256, 349, 770};
        int[] B = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        int kthElement = findKElement(A, B, k);
        System.out.println(kthElement);

    }
    public static int findKElement(int[] A, int[] B, int k) {
        int i = 0, j = 0, count = 0, result = 0;
        while (count < k) {
            if (i < A.length && j < B.length) {
                if (A[i] <= B[j]) {
                    result = A[i];
                    i++;
                } else {
                    result = B[j];
                    j++;
                }
            } else if (i < A.length) {
                result = A[i];
                i++;
            } else if (j < B.length) {
                result = B[j];
                j++;
            }
            count++;
        }
        return result;
    }

}