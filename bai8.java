import java.util.Scanner;

public class bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap giay=");
        int num1 = scanner.nextInt();
        int num2,num3,num4;
        num2 = num1/3600;
        num3 = (num1-num2*3600)/60;
        num4 = num1 - (num2*3600) - num3*60;
        System.out.println("Gio="+num2+"h");
        System.out.println("phut="+num3+"m");
        System.out.println("giay="+num4+"s");
	}

}
