import java.util.Scanner;

public class bai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner keyboard= new Scanner(System.in);
	        System.out.print("Nhap a = ");
	        int a=keyboard.nextInt();
	        System.out.print("Nhap b = ");
	        int b=keyboard.nextInt();
	        if (a > b) {
	            System.out.println("so lon nhat: "+a);
	        } else {
	            System.out.println("so lon nhat: "+b);
	        }
	}

}
