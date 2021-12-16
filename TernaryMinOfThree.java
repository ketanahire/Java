package javbasic;

import java.util.Scanner;

public class TernaryMinOfThree {
	public static void main(String[]args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1 :");
		a=sc.nextInt();
		System.out.println("Enter num2 :");
		b=sc.nextInt();
		System.out.println("Enter num3 :");
        c=sc.nextInt();
        int d=a<b&&a<c?a:c;
		int e=d<b?d:b;
		System.out.println(e);
		sc.close();
	}

}
