package javbasic;

import java.util.Scanner;

public class CirclePoint {

	public static void main(String[]args) {
		int x,y,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X :");
		x=sc.nextInt();
		System.out.println("Enter the value of Y :");
		y=sc.nextInt();
		System.out.println("Enter the value of the radius: ");
		r=sc.nextInt();
		int dp=x*x+y*y;
		int dr=r*r;
		if(dr==dp)
			System.out.println("Point lies on the circle");
		if(dr>dp)
			System.out.println("Point lies in side the cricle");
		if(dr<dp)
			System.out.println("Point lies outside the circle");
		if(dp==0)
			System.out.println("Point is at origin");
		sc.close();
	}
}
