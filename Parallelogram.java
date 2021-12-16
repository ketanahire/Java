package javbasic;
import java.util.Scanner;
public class Parallelogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,h,area,perimeter;
		System.out.println("Enter side1 :");
		a=sc.nextDouble();
		System.out.println("Enter side 2 :");
		b=sc.nextDouble();
		System.out.println("Enter the height :");
		h=sc.nextDouble();
		area=a*h;
		perimeter=2*(a+b);
		System.out.println("Area of the parallelogram ="+area);
		System.out.println("Perimeter of the parallelogram ="+perimeter);
		sc.close();
	}

}
