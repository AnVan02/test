import java.util.Scanner;

public class bai89 {
    public static int countOccurrences(int[] array, int x) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 2, 5};
        int x = 2;
        int count = countOccurrences(array, x);
        System.out.println("Phần tử " + x + " xuất hiện " + count + " lần trong mảng.");
    }
}
