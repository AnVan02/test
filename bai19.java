import java.util.Scanner;

public class bai19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,tram,chuc,donvi;
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n = kb.nextInt();
		tram=n/100;
		chuc=((n%100)/10);
		donvi=(n%10);
		if(tram<chuc & tram<donvi) {
			if(chuc<donvi) {
				System.out.println("Thu tu tang dan"+tram+chuc+donvi);
			}else {
				System.out.println("Thu tu tang dan"+tram+donvi+chuc);
			}
		}
		if(chuc<tram & chuc<donvi) {
			if(tram<donvi) {
				System.out.println("Thu tu tang dan"+chuc+tram+donvi);
			}else {
				System.out.println("Thu tu tang dan"+chuc+donvi+tram);
			}
		}
		if(donvi<tram & donvi<chuc) {
			if(tram<chuc) {
				System.out.println("Thu tu tang dan"+donvi+tram+chuc);
			}else {
				System.out.println("Thu tu tang dan"+donvi+chuc+tram);
			}
		}
	}

}
