package study.prob06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MatchNumber {

	public static void main(String[] args) throws IOException{
		
		Scanner scanner = new Scanner(System.in);
		int random = (int)(Math.random()*500)+1;
		int input = 0;
		int count = 0;
		
		/*
		 * // TODO Auto-generated method stub BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in));
		 * 
		 * System.out.print("���� �Է� : "); int num = Integer.parseInt(br.readLine());
		 * 
		 * br.close();
		 */
		
		do {
			++count;
			System.out.print("1���� 500������ ���� �Է��ϼ��� : ");
			input = scanner.nextInt();
			
			if(random>input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if (random < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				System.out.println("�����Դϴ�!!");
				System.out.println("�õ� Ƚ���� " + count + "���Դϴ�.");
				break;
			}
			
		} while(true);

	}

}
