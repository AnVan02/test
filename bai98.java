import java.util.Scanner;

public class bai98 {
    public static void main(String[] args) {
        int[] arr = {10, 15, 23, 50, 37, 40};
        int sum = tinhTongChiaHetCho5(arr);
        System.out.println("Tổng các phần tử chia hết cho 5 là: " + sum);
    }

    public static int tinhTongChiaHetCho5(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 5 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}