import java.util.Scanner;

public class bai111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a;
		int n;
		n = NhapN();
		a =new int[n];
		NhapMang(a);
		XuatMang(a);
		System.out.println("mang bi xoa: ");
		a= XoaPhanTuMax(a);
		if(a == null)
		{
			System.out.println("Mang rong ");
		}else
		{
			XuatMang(a);
		}
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
	public static int[] XoaTaiViTri(int[] a, int vtxoa)
	{
		int[] b;
		b = new int[a.length-1];
		for(int i= vtxoa; i<a.length-1; i++)
		{
			b[i] = a[i+1];
		}
		for(int i=0; i<vtxoa; i++)
		{
			b[i] = a[i];
		}
		return b;
	}
	public static int TimMax(int[] a)
	{
		int max= a[0];
		for(int i=1; i<a.length; i++)
		{
			if(max< a[i])
			{
				max = a[i];
			}
		}
		return max;
		
	}
	public static int[] XoaPhanTuMax(int[] a)
	{
		int max=TimMax(a);
		for(int i=0; i<a.length; i++)
		{
			if(max == a[i])
			{
				a= XoaTaiViTri(a,i);
				i--;
			}
		}
		if(a.length ==0 )
		{
			return null;
		}
		return a;
	}

}
