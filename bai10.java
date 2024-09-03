import java.util.Scanner;

public class bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
	       System.out.print("Nhap a=");
	       int a=keyboard.nextInt();
	       System.out.print("Nhap b=");
	       int b=keyboard.nextInt();
	       System.out.print("Nhap c=");
	       int c=keyboard.nextInt();
	       System.out.print("Nhap d=");
	       int d=keyboard.nextInt();
	       double Sum =(double)(a+b+c+d)/4;
	       System.out.println("Trung binh cong la "+Sum);
	}

}
