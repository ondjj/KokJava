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
			if(!(random == randomIdx)) {	//���ӵ� ���� ������ �ʰ� ����� ����, ����
				randomIdx = random;
			}else {
				continue;
			}
			outer2:
			for (int i = 0; i < month.length; i++) {
				System.out.printf(randomIdx + "��: ");
				String input = sc.next();
				if(input.equals(month[randomIdx-1])) {
					System.out.print("�����Դϴ�. �ٽ� �ѹ�? 1...Yes/0...No : ");
					int restart = sc.nextInt();
					if(restart == 1) {
						break outer2;
					}if(restart == 0) {
						System.out.println("�����մϴ�.");
						break outer;
					}
					
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
					continue;
				}
			}
			
		}
	       }



}

