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
		
		String str = "수학 점수 : "+math+"\n과학 점수 : " + science + "\n영어 점수 : "+ english;
		
		return str;
	}
	
	String avg(int math, int science, int english) {
		
		String result = "평균은" +(math+science +english)/3 + "점입니다.";
		
		return result;
		
	}
	

}
