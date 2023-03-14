public class SecondLargest {
    
 


    public int secondinArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second_maximum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second_maximum = max;
                max = arr[i];

            } else if (arr[i] > second_maximum && arr[i] != max) {
                second_maximum = arr[i];
            }

        }

        return second_maximum;

    }

 
    

    public static void main(String[] args) {
    
        int arr[] = { 4, 5, 2, 1, 6, 8, 10 };

        SecondLargest sl = new SecondLargest();

        System.out.println(sl.secondinArray(arr));

    }
}
