public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 8, 10};
        int target = 12;
        System.out.println(findTwoNumbers(arr, target));
    }

    public static String findTwoNumbers(int[] arr, int target) {

        for (int i = 0, j = arr.length - 1; i < j; ) {
            if (arr[i] + arr[j] == target) {
                return arr[i] + " + " + arr[j] + " = " + target;
            }
            if (arr[i] + arr[j] < target) {
                i++;
            }
            if (arr[i] + arr[j] > target) {
                j--;
            }
        }
        return "";
    }
}