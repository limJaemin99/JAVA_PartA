package partA.day04_week2;

import java.util.Scanner;

//not 논리연산 연습 : true ▶ false로, false ▶ true로 바꿔줌			//연산 기호 = !
public class A14LogicalNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int code;
		char result;
				
		System.out.println("아스키코드 정수값 0 ~ 127 입력하세요.");
		code = sc.nextInt();
		
		System.out.println("0 ~ 127 범위가 맞는지 확인 : " + (code >= 0 && code <= 127));
		System.out.println("0 ~ 127 범위가 아닌지 확인 : " + (code < 0 || code > 127));
		System.out.println("0 ~ 127 범위가 아닌지 확인 (not사용) : " + !(code >= 0 && code <= 127));	//2번과 같은 조건식
		result = (char)code;
		
		//32 ~ 126 일때만 출력하도록 한다. 그렇지 않으면 '출력할 수 없는 문자'로 출력 (not연산 사용)
		System.out.println("아스키코드값중에 문자로 출력 가능한 범위는 32 ~ 126");
		if(code >=32 && code <=126) {
		System.out.println("입력 문자 : " + result);
		} else if(!(code >=32 && code <=126)) {
			System.out.println("출력할 수 없는 문자");
		}
		
		//선생님 답변
		/*
		 * if(!(code >=32 && code <=126)) {
			System.out.println("출력할 수 없는 문자");
		} else {
			System.out.println("입력 문자 : " + result);
		}
		*/
	}
}
