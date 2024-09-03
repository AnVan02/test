import java.util.Scanner;

public class bai14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = kb.nextInt();
		System.out.println("Nhap b: ");
		int b = kb.nextInt();
		System.out.println("Nhap c: ");
		int c = kb.nextInt();
//		if (a<b & a<c) {
//			if (b<c) {
//				System.out.println("a = "+a+" ,b = "+b+" ,c= "+c);
//			}else {
//				System.out.println("a = "+a+" ,c = "+c+" ,b= "+c);
//			}
//		}
//		if (b<a & b<c) {
//			if (a<c) {
//				System.out.println("b = "+b+" ,a = "+a+" ,c= "+c);
//			}else {
//				System.out.println("b = "+b+" ,c = "+c+" ,a= "+a);
//			}
//		}
//		if (c<a & c<b) {
//			if (a<b) {
//				System.out.println("c = "+c+" ,a = "+a+" ,b= "+b);
//			}else {
//				System.out.println("c = "+c+" ,b = "+b+" ,a= "+a);
//			}
//		}
		int max=a;
		if(max<b) {
			max=b;
		}
		if(max<c) {
			max=c;
		}
		int min=a;
		if(min>b) {
			min=b;
		}
		if(min>c) {
			min=c;
		}
		int sogiua;
		sogiua=(a+b+c)-(max+min);
		System.out.println(min+"=>"+sogiua+"=>"+max);
	}

}
