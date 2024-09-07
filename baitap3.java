import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class baitap3 {
    // a. Phương thức liệt kê các phần tử không phải là số nguyên tố
    public static void listNonPrimes(int[] arr) {
        System.out.print("Các phần tử không phải là số nguyên tố: ");
        for (int num : arr) {
            if (!isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // b. Phương thức tính tổng các phần tử là số nguyên tố
    public static int sumOfPrimes(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                sum += num;
            }
        }
        return sum;
    }

    // c. Phương thức xóa các phần tử không là số nguyên tố
    public static int[] removeNonPrimes(int[] arr) {
        List<Integer> primesList = new ArrayList<>();
        for (int num : arr) {
            if (isPrime(num)) {
                primesList.add(num);
            }
        }

        if (primesList.isEmpty()) {
            System.out.println("Mảng rỗng");
            return new int[0];
        } else if (primesList.size() == arr.length) {
            System.out.println("Không có phần tử nào thỏa điều kiện");
            return arr;
        } else {
            int[] primesArray = new int[primesList.size()];
            for (int i = 0; i < primesList.size(); i++) {
                primesArray[i] = primesList.get(i);
            }
            return primesArray;
        }
    }

    // d. Phương thức main gọi tất cả các phương thức trên
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng (0 < n <= 100): ");
        int n = scanner.nextInt();
        if (n <= 0 || n > 100) {
            System.out.println("Số phần tử không hợp lệ!");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        listNonPrimes(arr);
        int sum = sumOfPrimes(arr);
        System.out.println("Tổng các phần tử là số nguyên tố: " + sum);

        int[] newArray = removeNonPrimes(arr);
        System.out.println("Mảng sau khi xóa các phần tử không là số nguyên tố: " + Arrays.toString(newArray));
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return   
 true;
    }
}