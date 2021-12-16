package javbasic;
import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		double side,v,csa,tsa;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of the cube:");
		side=sc.nextDouble();
		tsa=6*side*side;
		csa=4*side*side;
		v=side*side*side;
		System.out.println("Curved surface area of the cube ="+csa);
        System.out.println("Total surface area of the cube ="+tsa);
        System.out.println("Volume of the cube ="+v);
        sc.close();		
	}

}
