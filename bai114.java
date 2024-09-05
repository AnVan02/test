import java.util.Scanner;

public class bai114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a;
		int n;
		n = NhapN();
		a =new int[n];
		NhapMang(a);
		XuatMang(a);
		a= ChenXTVTDT(a);
		XuatMang(a);
	}
	public static int NhapN() {
		int n;
		Scanner kb = new Scanner(System.in);
		do {
			System.out.print("Nhap n: ");
			n=kb.nextInt();
			if(n<=0) {
				System.out.print("Nhap sai. Nhap lai: ");
			}
		}while(n<=0);
		return n;
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
			if (a[i] >0) {
				System.out.print(a[i]+ "\t");
			}
		}
	}
	public static int[] ChenTaiViTri(int[] a, int vtchen, int gtchen)
	{
		int[] b;
		b=new int[a.length+1];
		for(int i=a.length; i>vtchen; i--)
		{
			b[i] = a[i-1];
		}
		b[vtchen] =gtchen;
		for(int i=0; i< vtchen; i++)
		{
			b[i]=a[i];
		}
		return b;
	}
	public static int[] ChenXTVTDT(int[] a){
		int x;
		Scanner kb = new Scanner(System.in);
		System.out.println("Moi Nhap x: ");
		x= kb.nextInt();
		a=ChenTaiViTri(a,0,x);
		return a;
	}

}
