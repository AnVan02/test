import java.util.Scanner;

public class bai45 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập bán kính
        System.out.print("Nhập bán kính của hình tròn: ");
        double radius = scanner.nextDouble();

        // Tính diện tích
        double area = Math.PI * radius * radius;

        // Tính chu vi
        double circumference = 2 * Math.PI * radius;

        // In kết quả
        System.out.println("Diện tích của hình tròn là: " + area);
        System.out.println("Chu vi của hình tròn là: " + circumference);

        // Đóng scanner
        scanner.close();
    }
}