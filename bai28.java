import java.util.Scanner;

public class bai28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner kb = new Scanner(System.in);
		do {
			System.out.print("Moi nhap n: ");
			n=kb.nextInt();
			if(n<=0) {
				System.out.print("Moi nhap lai n: ");
			}
		}while(n<=0);
		int S=0;
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				S=S+i;
			}
		}
		if(S==n) {
			System.out.println("La so hoan thien");
		}else {
			System.out.println("Khong phai la so hoan thien");
		}
	}

}
