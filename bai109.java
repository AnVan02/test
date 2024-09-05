import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class bai109 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 8, 9, 2, 7, 6};
        
        // Lọc các số chẵn
        Integer[] evenNumbers = Arrays.stream(arr)
                                      .filter(num -> num % 2 == 0)
                                      .boxed()
                                      .toArray(Integer[]::new);

        // Sắp xếp các số chẵn theo thứ tự giảm dần
        Arrays.sort(evenNumbers, Collections.reverseOrder());

        // Hiển thị kết quả
        System.out.println("Các số chẵn sau khi sắp xếp giảm dần: " + Arrays.toString(evenNumbers));
    }
}
