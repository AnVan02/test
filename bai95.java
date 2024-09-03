import java.util.Scanner;

public class bai95 {
    public static int sumOddElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = sumOddElements(array);
        System.out.println("Tổng các phần tử lẻ trong mảng là: " + sum);
    }
}
