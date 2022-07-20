package morningJava;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     String arr[] = { "", "January", "Februaru", "March", "April", "May", "June", "July", "August", "September",
	             "October", "Novenber", "December" };
	       boolean flag = true;
	       Scanner sc = new Scanner(System.in);
	      
	       while (true) {
				while (flag) {
	             int month = (int) (Math.random() * 12) + 1;
	             System.out.print(month + "월 : ");

	             for (int i = 1; i < arr.length; i++) {
	                String a = sc.next();
	                if (i == month) {
	                   if (arr[i].equals(a)) {
	                      System.out.println("정답입니다. 다시 한번? 1...Yes/0...No : ");
	                      int replay = sc.nextInt();
	                      if(replay == 1) {
	                    	  flag = true;
	                      }
	                      else {
	                    	  flag =false;
	                      }
	                  
	                   } else {
	                      System.out.println("틀렸습니다.");
	                      continue;
	                   }
	                } else {
	                   continue;
	                }
	             }
	          }
	       }


	}

}
