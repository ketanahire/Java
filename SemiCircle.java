package javbasic;
import java.util.Scanner;
public class SemiCircle {

	public static void main(String[] args) {
         double r,area,perimeter;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius :");
        r=sc.nextDouble();
        area=(3.14*r*r)/2;
        perimeter=(3.14*r)+(2*r);
        System.out.println("Area is :"+area);
        System.out.println("Perimeter is :"+perimeter);
        sc.close();
        
        
	}

}
