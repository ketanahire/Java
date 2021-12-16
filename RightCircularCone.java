package javbasic;
import java.util.Scanner;
public class RightCircularCone {

	public static void main(String[] args) {
		double r,l,h,v,csa,tsa;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius :");
		r=sc.nextDouble();
		System.out.println("Enter the lenght of the side :");
		l=sc.nextDouble();
		System.out.println("Enter the height :");
		h=sc.nextDouble();
		csa=3.14*r*l;
		tsa=3.14*r*(l+r);
		v=(3.14*r*r*h)/3;
		System.out.println("Curved surface area  is :"+csa);
		System.out.println("Total surface area  is :"+tsa);
		System.out.println("Volume is :"+v);
		sc.close();
		
		
	}

}
