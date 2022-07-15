package study.quiz02;

public class DemensionArray_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[5][5];
		
		int num = 21;
		boolean sw = true;
		
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				
				arr[i][j] = num++;
				
			}
		}

	}

}
