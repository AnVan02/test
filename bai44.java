import java.util.Scanner;

public class bai44 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double length = scanner.nextDouble();

        // Nhập chiều rộng
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double width = scanner.nextDouble();

        // Tính diện tích
        double area = length * width;

        // Tính chu vi
        double perimeter = 2 * (length + width);

        // In kết quả
        System.out.println("Diện tích của hình chữ nhật là: " + area);
        System.out.println("Chu vi của hình chữ nhật là: " + perimeter);

        // Đóng scanner
        scanner.close();
    }
}