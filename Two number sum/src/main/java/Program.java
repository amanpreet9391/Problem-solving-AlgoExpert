import java.util.*;

class Program {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int i = 0;
        int j = array.length - 1;
        int[] arr = new int[2];
        while (i < j) {
            if (array[i] + array[j] == targetSum) {
                arr[0] = array[i];
                arr[1] = array[j];
                return arr;
            } else if (array[i] + array[j] < targetSum) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}
