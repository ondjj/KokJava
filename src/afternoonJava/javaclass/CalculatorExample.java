package afternoonJava.javaclass;

import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
//		char ch = in.next().charAt(0);
		
		Calculator cal = new Calculator();
		
		cal.num1 = (int)(Math.random()*100)+1;
		cal.num2 = (int)(Math.random()*100)+1;
		
		cal.ch = in.next().charAt(0);
		
		
		System.out.print("num1 : " + cal.num1 + ", ");
		System.out.print("num2 : " + cal.num2);
		System.out.println();
		
		
		cal.add(cal.num1, cal.num2, cal.ch);
		cal.minus(cal.num1, cal.num2, cal.ch);
		cal.multiple(cal.num1, cal.num2, cal.ch);
		cal.division(cal.num1, cal.num2, cal.ch);
		
		System.out.println("============================");
		cal.Cal(cal.num1, cal.num2, cal.ch);
	}

}
