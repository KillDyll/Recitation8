public class Recitation8 {
    /*
     * You may add any private helper method you see necessary,
     * but you may NOT change the signatures of the methods below.
     */
    public static boolean lastItemReachable(int[] hopList) {
        int max = 0;

        for (int i = 0; i < hopList.length; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(max, i + hopList[i]);
            if (max >= hopList.length - 1) {
                return true;
            }
        }
        return false;
    }

    public static int[] slidingWindowMin(int[] numberList, int windowSize) {
        int n = numberList.length;
        int[] result = new int[n - windowSize + 1];
        int resultIndex = 0;

        for (int i = 0; i <= n - windowSize; i++) {
            int min = numberList[i];
            for (int j = 1; j < windowSize; j++) {
                if (numberList[i + j] < min) {
                    min = numberList[i + j];
                }
            }
            result[resultIndex++] = min;
        }
        return result;
    }
}

