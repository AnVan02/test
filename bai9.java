import java.util.Scanner;

public class bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
        System.out.print("Nhap a= ");
        int a=keyboard.nextInt();
        System.out.print("Nhap b= ");
        int b=keyboard.nextInt();
        int Tong,Hieu,Tich,Thuong;
        Tong=a+b;
        System.out.println("Tong 2 so a va b la:"+Tong);
        Hieu=a-b;
        System.out.println("Hieu 2 so a va b la:"+Hieu);
        Tich=a*b;
        System.out.println("Tich 2 so a va b la:"+Tich);
        Thuong=a/b;
        System.out.println("Thuong 2 so a va b la:"+Thuong);
	}

}
