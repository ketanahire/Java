package javbasic;
import java.util.Scanner;
 class QuadrantWithoutAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X");
		x=sc.nextInt();
		System.out.println("Enter the value of Y");
		y=sc.nextInt();
		sc.close();
		if(x==0) 
			if(y==0)
				System.out.println("Origin");
		if(x==0) 
			if(y!=0)
				System.out.println("at Y-axis");
		if(y==0) 
			if(x!=0)
				System.out.println("at x-axis");
		if(x>0)
			if(y>0)
				System.out.println("first quadrant");
		if(x<0)
			if(y>0)
				System.out.println("second quadrant");
		if(x<0)
			if(y<0)
				System.out.println("Third quadrant");
		if(x>0)
			if(y<0)
				System.out.println("fourth quadrant");

	}		
}
