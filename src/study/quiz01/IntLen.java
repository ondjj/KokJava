package study.quiz01;

import java.util.Scanner;

public class IntLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int sum = 0; 
		int count = 0;
		/* �ڸ� �� ���
		 * int[] numLen = new int[in.nextInt()];
		 * 
		 * System.out.println(numLen.length);
		 */
		
		/* ���� ���� ���
		 * int[] ranNum = new int[in.nextInt()];
		 * 
		 * for(int i = 0; i<ranNum.length; i++) { ranNum[i] =
		 * (int)(Math.random()*(15-5)+6); System.out.print(ranNum[i]+" "); }
		 */
		
		/* ���� ���� �հ�
		 * int[] tenNum = new int[in.nextInt()];
		 * 
		 * for(int i = 0; i<tenNum.length; i++) { tenNum[i] =
		 * (int)(Math.random()*(20-2)+3); sum = sum+tenNum[i]; }
		 * System.out.println(sum);
		 */
		
		/* ���� ���� ¦�� ��, ���� ���
		 * int[] num = new int[in.nextInt()];
		 * 
		 * for(int i=0; i<num.length; i++) { num[i] = (int)(Math.random()*100)+1;
		 * if(num[i]%2==0) { sum += num[i]; count++; System.out.print(num[i]+" ");
		 * 
		 * } } System.out.println(); System.out.println(sum); System.out.println(count);
		 */
		int[] primeNum = new int[in.nextInt()];
		
		for(int i=0; i<primeNum.length; i++) {
			int primeRan = (int)(Math.random()*1000)+1;
		}
	}

}
