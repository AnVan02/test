import java.util.Scanner;

public class bai88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số lượng phần tử
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        // Nhập các phần tử của mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        // Đếm số lượng phần tử chẵn và lẻ
        int countEven = 0;
        int countOdd = 0;
        
        for (int num : arr) {
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        
        // In kết quả
        System.out.println("Số lượng phần tử chẵn: " + countEven);
        System.out.println("Số lượng phần tử lẻ: " + countOdd);
        
        scanner.close();
    }
}
