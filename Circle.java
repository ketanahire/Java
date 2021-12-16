package javbasic;
import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		double r,area,circumference;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle :");
		r=sc.nextDouble();
		area=3.14*r*r;
		System.out.println("Area of circle ="+area);
		circumference=2*3.14*r;
		System.out.println("Circumference of circlr ="+circumference);
		sc.close();
		
		
		

	}

}
