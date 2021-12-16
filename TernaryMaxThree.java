package javbasic;
import java.util.Scanner;
public class TernaryMaxThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		a=sc.nextInt();
		System.out.println("Enter num2 :");
		b=sc.nextInt();
		System.out.println("Enter num3 :");
		c=sc.nextInt();
		int d=a>b&&a>c?a:c;
		int e=d>b?d:b;
		System.out.println(e);
		sc.close();
	}

}
