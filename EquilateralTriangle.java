package javbasic;
import java.util.Scanner;
public class EquilateralTriangle {

	public static void main(String[] args) {
		double a,h,area,perimeter;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of the equilateral triangle =");
		a=sc.nextDouble();
		System.out.println("Enter the height of the triangle =");
		h=sc.nextDouble();
		area=(a*h)/2;
		perimeter=3*a;
		System.out.println("Area of eauilateral triangle ="+area);
		System.out.println("Perimeter of equilateral triangle ="+perimeter);

	}

}
