package javbasic;

import java.util.Scanner;

public class IsoscelesRightTriangle {

	public static void main(String[] args) {
		double a,h,area,perimeter;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of the triangle =");
		a=sc.nextDouble();
		System.out.println("Enter the hypotenius of the triangle =");
		h=sc.nextDouble();
		area=(a*a)/2;
		perimeter=2*a+h;
		System.out.println("Area of IsoscelesRightTriangle ="+area);
		System.out.println("Perimeter of IsoscelesRightTriangle ="+perimeter);
		sc.close();

	}

}
