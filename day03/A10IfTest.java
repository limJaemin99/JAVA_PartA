package partA.day03;

//if 조건문 시작
//	1) if(조건식){참일때 실행할 문장}
//	2) if(조건식){참일때 실행할 문장} else {거짓일때 실행할 문장}
//	3) if(조건식){참일때 실행할 문장} else {if(거짓일때 조건식){거짓일때 조건식이 참일경우 실행할 문장} else {거짓일때 조건식이 거짓일경우 실행할 문장}}	

public class A10IfTest {
	public static void main(String[] args) {
		
		
		
		  int age = 26;					//데이터를 소스코드에 직접 써서 하는것을 하드코딩이라 함
		  								//여러 다양한 값을 테스트하려면 불편함. 사용자입력으로 업데이트 할거임
		  boolean isAdult = false;		//초기값을 저장하지 않음
		  
		  System.out.println("조건식 미리 확인 : " + (age >= 20));
		  
		  if(age >= 20) {				//age가 16이면 거짓, age가 26이면 참
			  isAdult = true;			//	(실행 X)			 (실행 O)
		  }
		  
		  System.out.println("isAdult : " + isAdult);
		  
		  System.out.println();
		  
		  
		  int point = 70;				//point가 70 이상이면 vip, 70 미만이면 일반회원으로 출력
		  int vipPoint = 70;			//vip회원이면 이벤트 포인트 100포인트, 일반회원 50포인트 추가적립
		  
		  if(point >= vipPoint) {
			  System.out.println("vip회원");
			  point += 100;
		  } else {						//point가 <70 일때 실행
			  System.out.println("일반회원");
			  point += 50;
			 if(point >= vipPoint) {
				 System.out.println("vip회원으로 승급되셨습니다");
			 } else {
				 System.out.println("vip 승급까지 " + (vipPoint-point) + "점 남았습니다.");
			 }
		  }
		  
		  System.out.println("고객님의 최종 포인트는 " + point + "입니다.");
		  
		  
		
		
		
		
		
	}
}
