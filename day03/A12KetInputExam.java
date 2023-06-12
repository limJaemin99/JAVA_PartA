package partA.day03;

import java.util.Scanner;

public class A12KetInputExam {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		
		  int age;					
		  
		  System.out.println("나이를 입력해주세요");
		  age = sc.nextInt();
		  if(age >= 20) {				
			  System.out.println("성인입니다.");
		  } else {
			  if(age >13) {
				  System.out.println("청소년입니다.");
			  } else {
				  System.out.println("어린이입니다.");
			  }
		  }
		  
		  for (int i = 0; i < 17; i++) {
			  Thread.sleep(100);
			  System.out.print("-");
		  }
		  System.out.println();
		  
		//point가 70 이상이면 vip, 70 미만이면 일반회원으로 출력
		//vip회원이면 이벤트 포인트 100포인트, 일반회원 50포인트 추가적립
		  
		  int point;				
		  int vipPoint = 70;			
		  
		  System.out.println("보유중인 포인트를 입력해주세요.");
		  point = sc.nextInt();
		  
		  if(point >= vipPoint) {
			  System.out.println("vip회원");
			  point += 100;
			  System.out.println("이벤트로 100포인트가 적립되었습니다.");
			  for (int i = 0; i < 3; i++) {
					Thread.sleep(1000);
					System.out.println(".");
			}
		  } else {						
			  System.out.println("일반회원");
			  point += 50;
			  System.out.println("이벤트로 50포인트가 적립되었습니다.");
			  for (int i = 0; i < 3; i++) {
				  Thread.sleep(1000);
				  System.out.println(".");
			  }
			 if(point >= vipPoint) {
				 System.out.println("vip회원으로 승급되셨습니다");
			 } else {
				 System.out.println("vip 승급까지 " + (vipPoint-point) + "점 남았습니다.");
			 }
		  }
		  
		  System.out.println("고객님의 최종 포인트는 " + point + "입니다.");
		  
		  
		
		
		
		
		
	}
}
