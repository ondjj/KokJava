package afternoonJava.gettersetter;

public class PersonExample {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("ȫ�浿");
		person1.setAge(30);
	
		System.out.println(person1); 
		
		Person person2 = new Person("�ڱ浿", 21);
		System.out.println(person2);
		person2.setAge(15);
		person2.setName("ȥ�ڹ�");
		System.out.println(person2);
	}

}
