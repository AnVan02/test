import java.util.Scanner;

public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Celcius;
	     Scanner Keyboard=new Scanner(System.in);
	     System.out.println("Nhập vào số Fahrenheit cần đổi:");
	     Celcius = Keyboard.nextDouble();
	     Double Fahrenheit = (double) 5/9 * (Celcius - 32);
	     System.out.println(Celcius + "độ F = " + Fahrenheit + "Độ C");
	}

}
