import java.util.Scanner;

public class bai29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,S=0;
		Scanner kb = new Scanner(System.in);
		do {
			System.out.println("Nhap n: ");
			n= kb.nextInt();
			if(n<0) {
				System.out.println("Moi nhap n lon hon 0");
			}
		}while(n<0);
		for(int i=1; i<=n; i++) {
			S=S+i;
		}
		System.out.println("Tong= "+S);
	}
}
