package javbasic;
import java.util.Scanner;
public class EvenOdd {
     public static void main(String[]args) {
    	 int a;
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter any number:");
    	 a=sc.nextInt();
   	 int c=a%2==0?0:1;
    	 
    	 
    	 sc.close();
    	 System.out.println(c);
     }
}
