import java.util.Scanner;

public class bai35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương n
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        // Tính tổng S
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, i);  // Tính i^i và cộng vào tổng S
        }

        // In kết quả
        System.out.println("Tổng S = " + sum);
    }

}