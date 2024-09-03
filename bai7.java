import java.util.Scanner;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gio=");
        int num1 = scanner.nextInt();
        System.out.print("Nhap phut=");
        int num2 = scanner.nextInt();
        System.out.print("Nhap giay=");
        int num3 = scanner.nextInt();
        int thoigian = num1*3600 + num2*60 + num3;
        System.out.println("Thoi gian la:"+thoigian+"s");
	}

}
