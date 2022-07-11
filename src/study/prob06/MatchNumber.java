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
		 * System.out.print("숫자 입력 : "); int num = Integer.parseInt(br.readLine());
		 * 
		 * br.close();
		 */
		
		do {
			++count;
			System.out.print("1부터 500사이의 값을 입력하세요 : ");
			input = scanner.nextInt();
			
			if(random>input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (random < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("정답입니다!!");
				System.out.println("시도 횟수는 " + count + "번입니다.");
				break;
			}
			
		} while(true);

	}

}
