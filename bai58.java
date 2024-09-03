import java.util.Scanner;

public class bai58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner kb = new Scanner (System.in);
		do
		{
			System.out.println("Moi nhap n: ");
			n=kb.nextInt();
			if(n<1 || n>99999) {
				System.out.println("Moi nhap lai : ");
			}
		}while(n<1 || n>99999);
		TongUocSo(n);
	}
	public static void TongUocSo(int n) {
		int S=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				S=S+i;
			}
		}
		System.out.println("Tong so uoc so cua n: "+S);
	}
}

