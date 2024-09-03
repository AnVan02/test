import java.util.Scanner;

public class bai27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,tich;
		Scanner kb = new Scanner(System.in);
		do {
			System.out.print("Moi nhap bạn nhao a: ");
			a=kb.nextInt();
			if(a<=0) {
				System.out.print("Nhap sai");
			}
		}while(a<=0);
		do {
			System.out.print("Moi nhap b: ");
			b=kb.nextInt();
			if(b<=0) {
				System.out.print("Nhap sai");
			}
		}while(b<=0);
		tich=a*b;
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}else {
				b=b-a;
			}
		}
		System.out.println("USCLN "+a);
		System.out.println("BCNN "+tich/a);
	}

}
