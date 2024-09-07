import java.util.Scanner;

public class bai3 {
    public static int a(int n) {
        int product = 1;
        for (int i = 1; i <= 2 * n + 1; i += 2) {
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) {
        int n = 3; 
        int result = a(n);
        System.out.println("P = " + result);
    }
}
