import java.util.Scanner;

public class bai15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = kb.nextInt();
		System.out.println("Nhap b: ");
		int b = kb.nextInt();
		double x=(double)-b/a;
		System.out.println("X la : "+x);
	}
}
