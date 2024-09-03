import java.util.Scanner;

public class bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner keyboard=new Scanner(System.in);
	        System.out.print("Nhap canh hinh vuong a = ");
	        int a=keyboard.nextInt();
	        int HV;
	        HV =a*4;
	        System.out.print("Chu vi hinh vuong = "+HV);
	        System.out.print("\nNhap canh x=");
	        int x=keyboard.nextInt();
	        System.out.print("Nhap canh y=");
	        int y=keyboard.nextInt();
	        System.out.print("Nhap canh z=");
	        int z=keyboard.nextInt();
	        int TG;
	        TG=x+y+z;
	        System.out.print("Chu vi hình tam giác ="+TG);
	        System.out.print("\nNhap chieu cao = ");
	        int c=keyboard.nextInt();
	        System.out.print("Nhap chieu dai = ");
	        int d=keyboard.nextInt();
	        int HCN;
	        HCN =(c+d)*2;
	        System.out.print("Chu vi HCN = "+HCN);
	        System.out.print("\nnhap ban kinh = ");
	        int r=keyboard.nextInt();
	        int HT;
	        HT= (r*2)*(314/100);
	        System.out.println("Chu vi hinh tron = "+HT);
	}

}
