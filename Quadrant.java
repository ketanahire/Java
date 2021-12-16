package javbasic;
import java.util.Scanner;
public class Quadrant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("Enter the value of x :");
		x=sc.nextInt();
		System.out.println("Enter the value of y :");
		y=sc.nextInt();
		if(x==0&&y==0)
			System.out.println("Point lies on the origin");
		else if(x>0&&y>0)
			System.out.println("Point lies in first quadrant");
		else if(x<0&&y>0)
			System.out.println("Point lies in the second quadrant");
		else if(x<0&&y<0)
			System.out.println("Point lies in the third quadrant ");
		else if (x>0&&y<0)
			System.out.println("Point lies in the fourth quadrant ");
		else if(x>0&&y==0)
			System.out.println("Point lies on the  X axis");
		else
			System.out.println("Point lies on the Y axis");
		sc.close();
			
	}

}
