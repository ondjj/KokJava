package study.prob04;

public class ConsecutiveAdditionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int sum = 0;
		
		while(num>0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("sum="+sum);

	}

}
