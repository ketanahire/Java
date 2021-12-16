package javbasic;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
	   double length,breadth,area,perimeter;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the length of the ractangle =");
	   length=sc.nextDouble();
	   System.out.println("Enter the height of the  ractangle =");
	   breadth=sc.nextDouble();
	   area=2*length*breadth;
	   System.out.println("Area of reactangle ="+area);
	   perimeter=2*(length+breadth);
	   System.out.println("Perimeter of rectangle "+perimeter);

	}

}
