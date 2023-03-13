public class ReverseArray {

    private static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }

    }

    public static void main(String[] args) {

        int[] a = { 2, 11, 5, 10, 7, 8 };

        int i = 0;
        int j = a.length - 1;
        int temp;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
            i++;

        }

        printArray(a);

    }

}
