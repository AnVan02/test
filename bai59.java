import java.util.Scanner;

public class bai59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương n
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        // Tìm ước số lẻ lớn nhất
        int maxOddDivisor = 1;
        for (int i = n; i >= 1; i--) {
            if (n % i == 0 && i % 2 != 0) { // Kiểm tra nếu i là ước số lẻ
                maxOddDivisor = i;
                break;
            }
        }

        // In kết quả
        System.out.println("Ước số lẻ lớn nhất của " + n + " là: " + maxOddDivisor);
    }
}
