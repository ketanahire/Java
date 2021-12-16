package javbasic;

import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valuen of a: ");
		a=sc.nextInt();
		System.out.println("Enter the value of  b :");
		b=sc.nextInt();
		System.out.println("Enter the value of c :");
		c=sc.nextInt();
		if(a>b)
			if(a>c)
				System.out.println(a +" is max");
			else
				System.out.println(c+" is max");
		else
			if(b>c)
				System.out.println(b+" is max");
			else
				System.out.println(c+" is max");
		sc.close();

	}

}
