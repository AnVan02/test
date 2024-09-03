import java.util.Random;
import java.util.Scanner;

public class bai74 {
    static final int MAX = 100;

    public static void createArray(int[] a, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(100) - rand.nextInt(100);
        }
    }

    public static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    public static int findMinIndex(int[] a, int n) {
        int minIndex = 0;
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] a = new int[MAX];
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu thuc su: ");
        n = scanner.nextInt();
        createArray(a, n);
        printArray(a, n);
        int result = findMinIndex(a, n);
        System.out.println("\nVi tri cua gia tri Min la: " + result + "\t");
        scanner.close();
    }
}

