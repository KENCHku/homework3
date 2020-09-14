import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double sum = 0;
        double kol = 0;
        boolean isOtr = false;
        double[] mas1 = {8.0, -2.0, 4.0, -6.0, 5.0, -8.0, 3.0, -6.0, -9.0, -3.0, 2.0, -7.0, -4.0, 1.0};

        bubbleSort(mas1);

        System.out.println(Arrays.toString(mas1));

    }

        public static void bubbleSort(double[] arr) {

            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        double tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }
        }
}





