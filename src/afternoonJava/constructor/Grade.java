package afternoonJava.constructor;

public class Grade {
	int math;
	int science;
	int english;
	
	Grade(){
		
	}
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	@Override
	public String toString() {
		
		String str = "���� ���� : "+math+"\n���� ���� : " + science + "\n���� ���� : "+ english;
		
		return str;
	}
	
	String avg(int math, int science, int english) {
		
		String result = "�����" +(math+science +english)/3 + "���Դϴ�.";
		
		return result;
		
	}
	

}
