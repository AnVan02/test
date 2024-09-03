import java.util.Scanner;

public class bai57 {

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
		DemSNT(n);
	}
	public static boolean KTSNT(int n) {
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}else {
			return false;
		}
	}
	public static void DemSNT(int n) {
		int du, snttrue=0, sntfaile=0;
		while(n!=0) {
			du= n % 10;
			if(KTSNT(n)==true) {
				snttrue++;
			}else {
				sntfaile++;
			}
			n=n/10;
		}
		System.out.println("Co "+ snttrue + " so nguyen to. Co " + sntfaile + " so khong phai la so nguyen to ");
	}

}
