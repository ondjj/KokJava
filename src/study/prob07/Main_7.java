package study.prob07;

import java.util.Scanner;

public class Main_7 {

	public static void main(String[] args) {
		/*
		 * ���� 
		 * ���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
		 * 
		 * �Է� 
		 * ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
		 * 
		 * ��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����.
		 * ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
		 * 
		 * ��� 
		 * �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
		 */
		Scanner in = new Scanner(System.in);
		
		int C = in.nextInt();
		int sum = 0;
		int count = 0;
		
		int num[] = new int[in.nextInt()];
		
		for(int i=0; i<num.length;i++) {
			num[i] = in.nextInt();
			sum += num[i];
		}
		
		double avg = (double)sum/num.length;
		
		for (int i = 0; i < num.length; i++) {
			sum = 0;
			if(num[i] >= avg) {
				sum += num[i];
				count++;
			}
		}
		System.out.println(sum/(double)count);
		System.out.println(avg);
		in.close();
		
		

		
		
	
		}
		
	
	}


