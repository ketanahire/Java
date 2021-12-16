package javbasic;
import java.util.Scanner;
public class Hemisphere {

	public static void main(String[] args) {
		double r,v,csa,tsa;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius :");
		r=sc.nextDouble();
		csa=2*3.14*r*r;
		tsa=3*3.14*r*r;
		v=(3.14*r*r*r)*2/3;
		System.out.println("Curved surface area is :"+csa);
		System.out.println("Total surface area is :"+tsa);
		System.out.println("Volume is :"+v);
		sc.close();
	}

}
