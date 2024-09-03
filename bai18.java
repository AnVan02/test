import java.util.Scanner;

public class bai18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,tram,chuc,donvi;
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap n(gom 3 chu so nguyen): ");
		n = kb.nextInt();
		tram=n/100;
		chuc=((n%100)/10);
		donvi=(n%10);
//		if(chuc>tram & chuc>donvi) {
//			System.out.println("Chu so lon nhat la: "+chuc);
//			System.out.println("o vi tri so 2: ");
//		}else if (tram>chuc & tram >donvi) {
//			System.out.println("Chu so lon nhat la: "+tram);
//			System.out.println("o vi tri so 1: ");
//		}
//		if (donvi>tram & donvi>chuc) {
//			System.out.println("Chu so lon nhat la: "+donvi);
//			System.out.println("o vi tri so 3: ");
//		}
		int max=tram;
		if(max<chuc) {
			max=chuc;
		}
		if(max<donvi) {
			max=donvi;
		}
		if(max == tram) {
			System.out.println("Chu so lon nhat o hang tram (chu so"+max+")");
		}
		if(max == chuc) {
			System.out.println("Chu so lon nhat o hang chuc (chu so"+max+")");
		}
		if(max == donvi) {
			System.out.println("Chu so lon nhat o hang donvi (chu so"+max+")");
		}
	}

}
