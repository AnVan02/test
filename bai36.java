import java.util.Scanner;

public class bai36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương n
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        // Tính tổng S
        long sum = 0;
        long product = 1;

        for (int i = 1; i <= n; i++) {
            product *= i;  // Tính 1 * 2 * ... * i
            sum += product;  // Cộng vào tổng S
        }

        // In kết quả
        System.out.println("Tổng S = " + sum);
    }
}
