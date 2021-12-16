package javbasic;
import java.util.Scanner;
public class MinOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1 :");
		a=sc.nextInt();
		System.out.println("Enter num2 :");
		b=sc.nextInt();
		System.out.println("Enter num3 :");
        c=sc.nextInt();
        if(a<b)
        	if(a<c)
        		System.out.println(a);
        	else
        		System.out.println(c);
        else
        	if(b<c)
        		System.out.println(b);
        	else
        		System.out.println(c);

	}

}
