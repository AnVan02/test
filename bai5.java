import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N,sodu,tong=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Nhap n = ");
		N =keyboard.nextInt();
		while (N>0) {
			sodu= N%10;
			N=N/10;
			tong += sodu;
		}
		System.out.println("Tong cac chu so:"+tong);
	}

}
