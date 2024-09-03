import java.util.Scanner;

public class bai64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;
		final int n = 100;
		a =new int[n];
		NhapMang(a);
		XuatMang(a);
	}
	public static void NhapMang(int[] a) 
	{
		Scanner kb = new Scanner(System.in);
		for(int i=0;i<a.length; i++) {
			System.out.print("a["+i+"]=");
			a[i]=kb.nextInt();
		}
	}
	public static void XuatMang(int[] a)
	{
		System.out.print("\n Mang vua nhap: ");
		for(int i=0; i<a.length; i++) {
				System.out.print(a[i]+ "\t");
		}
	}


}
