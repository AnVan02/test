import java.util.Scanner;

public class bai60 {

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
		DemChuSo(n);
	}
	public static void DemChuSo(int n) {
		int dem=0,du, chan=0, le=0;
		while(n!=0) {
			du= n % 10;
			dem++;
			if(du % 2==0) {
				chan++;
			}else {
				le++;
			}
			n=n/10;
		}
		if(dem==chan) {
			System.out.println("So nguyen duong toan chan ");
		}else
		{
			if(dem==le) {
				System.out.println("So nguyen duong toan le ");
			}else
			{
				System.out.println("So nguyen duong vua chan va le");
			}
		}
	}
}
