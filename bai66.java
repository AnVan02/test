import java.util.Random;
import java.util.Scanner;

public class bai66 {
    // định nghĩa số phần tử mảng
    private static final int MAX = 1000;

    public static void main(String[] args) {
        int[] myArray = new int[MAX]; // mảng myArray có MAX phần tử
        int nSize; // nSize là số phần tử được sử dụng, do user nhập

        // nhập xuất mảng tự động
        nSize = nhapMang(myArray);
        xuatMang(myArray, nSize);
    }

    // hàm nhập mảng
    private static int nhapMang(int[] arr) {
        // khởi tạo số ngẫu nhiên
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu n : ");
        int n = scanner.nextInt();

        // khởi tạo ngẫu nhiên từng phần tử từ chỉ số 0 đến n – 1
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt() * -1;
        }
        return n;
    }

    // hàm xuất mảng
    private static void xuatMang(int[] arr, int n) {
        // xuất từng phần tử cho mảng từ chỉ số 0 đến n – 1
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}

