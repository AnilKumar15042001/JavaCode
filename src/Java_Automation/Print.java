package Java_Automation;

import java.util.Scanner;

public class Print {

	static String s="Anil";
	static Bank1 s2;
	public Print(String s3) {
		
		s3=s;
	}
	public static void main(String[] args) {
		
		
//		System.out.print("Anil");
//		Print.s.charAt(2);
//		Print.s2.checkBalance();
		
		
		Scanner s=new Scanner(System.in);
		
		
		Print p=new Print(Print.s);
		System.out.println(p);
		
		String s4=p.toString();
		System.out.println(s4);
		
	}
	@Override
	public String toString() {
		return "Print [toString()=" + super.toString() + "]";
	}
	
	
}
