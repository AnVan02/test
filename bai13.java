import java.util.Scanner;

public class bai13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		System.out.println("Nhập a: ");
		int a = kb.nextInt();
		System.out.println("Nhập b: ");
		int b = kb.nextInt();
		System.out.println("Nhập c: ");
		int c = kb.nextInt();
		int max = a;
		if(max<b) {
			max=b;
		}
		if(max<c) {
			max=c;
		}
		System.out.println("Gia tri lon nhat: "+max);
	}

}
