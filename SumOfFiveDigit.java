package javbasic;

import java.util.Scanner;

public class SumOfFiveDigit {

	public static void main(String[] args) {
		int num,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Four digit number:");
		num=sc.nextInt();
		sc.close();
		for(int i=0;i<5;i++) {
			digit=num%10;
			sum=sum+digit;
			num/=10;
			
		}
		System.out.println(sum);
		


	}

}
