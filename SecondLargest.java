public class SecondLargest {

    public int secondinArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];

            } else if (arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }

        }

        return second_max;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 1, 6, 8 };
        SecondLargest sl = new SecondLargest();
        System.out.println(sl.secondinArray(arr));

    }
}
