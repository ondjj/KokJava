package morningJava;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] month = {"January","February","March","April",
				"May","June","July","August","September","October","November","December"};
		
		
//		System.out.println(Arrays.toString(month));
		
 
		outer: 
		while(true) {
			int random = (int)(Math.random()*12)+1;;
			int randomIdx = 0;
			if(!(random == randomIdx)) {	//연속된 달이 나오지 않게 선언된 변수, 조건
				randomIdx = random;
			}else {
				continue;
			}
			outer2:
			for (int i = 0; i < month.length; i++) {
				System.out.printf(randomIdx + "월: ");
				String input = sc.next();
				if(input.equals(month[randomIdx-1])) {
					System.out.print("정답입니다. 다시 한번? 1...Yes/0...No : ");
					int restart = sc.nextInt();
					if(restart == 1) {
						break outer2;
					}if(restart == 0) {
						System.out.println("종료합니다.");
						break outer;
					}
					
				}else {
					System.out.println("틀렸습니다.");
					continue;
				}
			}
			
		}
	       }



}

