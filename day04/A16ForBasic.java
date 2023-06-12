package partA.day04_week2;

import java.util.Iterator;

/* 밖에서 초기화 한 경우 초기식 생략 가능
 * int i = 0;
 * for (    ; i < args.length; i++)
*/
public class A16ForBasic {
	public static void main(String[] args) {
		//1)반복문 제어변수를 for()에서 선언
		for(int i = 0; i < 10; i++) {		//여기서 선언된 변수는 for{}안에서만 사용된다
//			for (①초기식int i = 0; ②조건식i < 10; ③증감식i++) {
//				④반복실행할 명령문
//		}	실행순서 :① ▶ ② ▶ (② > 참일경우) ④명령문 실행 ▶ ③증감식 실행
//				  	   ▶ ② ▶ (② > 참일경우) ④명령문 실행 ▶ ③증감식 실행
//				 	     ▶ ② ▶ (② > 참일경우) ④명령문 실행 ▶ ③증감식 실행		순서로 계속 반복
//			for문이 종료되는 경우는 ② > 거짓일경우
			System.out.println("안녕 i:"+i+" "+(i<10));	//④반복실행할 명령문
		}			 
		System.out.println("--------------");
		//2)반복문 제어변수를 for()밖에서 선언
		int j;
		for (j = 0; j < 10; j++) {
			//반복 명령문 없이 실행
		}
		System.out.println("안녕 j:"+j+" "+(j<10));	//j=10 false	2)는 변수 j가 선언되었음
		
		System.out.println("--------------");
		//3)처음 제어변수의 값이 조건 거짓인 경우
		for (int i = 0; i > 10; i++) {
			System.out.println("나 3)번 for는 실행되나요?");
		}
		
		//4)for문의 초기식, 조건식, 증감식이 모두 없을때	▶ 5)번 명령 실행 안되므로 오류발생
//		for(;;) {
//			System.out.println("무한 반복 loop 상태 입니다.");
//		}
		
		System.out.println("--------------");
		//5)초기식 없이 사용하는 경우
		for(;j>0;j--) {
			System.out.println("j:"+j+" "+(j>0));
		}
		
		
		
		
		
	}
}
