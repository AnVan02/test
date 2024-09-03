import java.util.Scanner;

public class bai30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner kb = new Scanner(System.in);
		do {
			System.out.println("moi nhap n: ");
			n= kb.nextInt();
			if(n<0) {
				System.out.println("Nhap lai n");
			}
		}while(n<0);
		int S=0;
		for(int i=1; i<=2*n+1; i=i+2) {
			S=S+i;
		}
		System.out.println("Tong S= "+S);
	}

}
