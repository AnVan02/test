import java.util.Scanner;

public class bai21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float km;
		Scanner kb = new Scanner(System.in);
		long money=0;
		final int giadau=16000;
		final int giathem=15000;
		final int giatren30=12000;
		System.out.println("Nhap so km: ");
		km = kb.nextFloat();
		while(km<=0) {
			System.out.println("Moi nhap lai km khong duoc nho hon 0: ");
			km=kb.nextFloat();
		}
		if(km <= 1) {
			money = 16000;
		}else if(km <= 30) {
			money= (long) (giadau + giathem * (km - 1));
		}else {
			money = (long) (giadau + giathem * (30 - 1) + giatren30 * (km - 30));
		}
		System.out.println("So tien di "+km+"km= "+money+"dong.");
		
	}

}
