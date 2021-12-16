package javbasic;
import java.util.Scanner;
public class Cuboid {

	public static void main(String[] args) {
		double l,b,h,csa,tsa,v;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length =");
		l=sc.nextDouble();
		System.out.println("Enter the breadth =");
		b=sc.nextDouble();
		System.out.println("Enter the height =");
		h=sc.nextDouble();
		csa=2*h*(l+b);
		tsa=2*(l*b+b*h+h*l);
		v=l*b*h;
		System.out.println("Curved surface area of the Cuboid ="+csa);
		System.out.println("Total surface area of the Cuboid ="+tsa);
		System.out.println("Volume of the Cuboid ="+v);
		sc.close();

	}

}
