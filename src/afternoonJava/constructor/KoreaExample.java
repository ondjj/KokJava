package afternoonJava.constructor;

public class KoreaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korea k1 = new Korea("박자바", "012345-1234567");
		Korea k2 = new Korea("김자바", "012345-7890123");
		
		System.out.println(k1.name+", "+k1.ssn);
		System.out.println(k2.name+", "+k2.ssn);
	}

}
