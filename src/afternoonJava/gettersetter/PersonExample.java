package afternoonJava.gettersetter;

public class PersonExample {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("È«±æµ¿");
		person1.setAge(30);
	
		System.out.println(person1); 
		
		Person person2 = new Person("¹Ú±æµ¿", 21);
		System.out.println(person2);
		person2.setAge(15);
		person2.setName("È¥ÀÚ¹Ù");
		System.out.println(person2);
	}

}
