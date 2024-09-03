import java.util.Scanner;

public class bai31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,S=0;
		Scanner kb = new Scanner(System.in);
		do {
			System.out.println("Nhap n: ");
			n=kb.nextInt();
			if(n<0) {
				System.out.println("Nhap lai n: ");
			}
		}while(n<0);
		for (int i=1; i<=n; i++) {
			if(i%2==0) {
				S=S-i;
			}else
			{
				S=S+i;
			}
		}
		System.out.println("Tong S= "+S);
	}

}
