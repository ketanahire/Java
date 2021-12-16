package javbasic;
import java.util.Scanner;
public class RingShadeRegion {

	public static void main(String[] args) {
		double R,r,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the outer radius :");//Outer radius is always greater than inner radius 
		R=sc.nextDouble();
		System.out.println("Enter the inner radius :");
		r=sc.nextDouble();
		area=3.14*(R*R-r*r);
		System.out.println("Area is :"+area);
		sc.close();
		

	}

}
