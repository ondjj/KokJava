package afternoonJava.javaclass;

import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member();
		Scanner in = new Scanner(System.in);
		member.name = in.next();
		member.age = in.nextInt();
		member.password = in.next();
		member.id = in.next();
		
		System.out.print(member.age+"ªÏ¿Œ "+member.name+"("+member.id+")¥‘"+"æ»≥Á«œººø‰");

	}

}
