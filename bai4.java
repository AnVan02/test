import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Nhap a = ");
		a = keyboard.nextInt();
		System.out.print("Nhap b = ");
		b = keyboard.nextInt();
		System.out.println("Phan nguyen = "+a/b);
		System.out.println("Phan du = "+a%b);
	}

}
