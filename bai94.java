import java.util.Random;
import java.util.Scanner;

public class bai94 {
    static final int MAX = 100;

    public static void main(String[] args) {
        int[] a = new int[MAX];
        int n, kq;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu thuc: ");
        n = scanner.nextInt();

        // NhapMang(a, n); // Uncomment if you want to input the array manually

        MangNgauNhien(a, n);
        XuatMang(a, n);

        kq = TongPTChan(a, n);
        System.out.println("\nTong cac phan tu chan co trong mang la: " + kq);

        scanner.close();
    }

    static void MangNgauNhien(int[] a, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(100) - rand.nextInt(100);
        }
    }

    static void XuatMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    static int TongPTChan(int[] a, int n) {
        int tong = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                flag = true;
                tong += a[i];
            }
        }
        return flag ? tong : -1;
    }
}

