import java.util.Scanner;

public class bai24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner kb= new Scanner(System.in);
		do {
			System.out.println("Nhap n: ");
			n=kb.nextInt();
			if(n<=0) {
				System.out.print("Moi nhap lai n");
			}
		}while(n<=0);
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i+ " ");
			}
		}
	}

}
