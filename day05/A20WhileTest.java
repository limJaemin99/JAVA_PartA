package partA.day05;

import java.util.Scanner;

//반복문 while
public class A20WhileTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean status = true;
		//while문은 ()안에 초기식과 증감식이 포함되지 않음
		
		while(status) {	//while(조건식) : 조건식이 true인 동안 { } 안의 내용이 반복실행
			System.out.print("정수값 1개를 입력하세요.\n☞");
			int n = sc.nextInt();
			if(n==-999) break;	//명령어가 1개이므로 {}생략 가능		>>	이하의(아래) 명령들을 실행하지 않고 while 끝내기
//			▶ 또는 if(n==-999) status = false;	>>	이하의(아래) 명령들을 실행함
			System.out.println("::::: "+n+" :::::\n");
			
		}
		
		//for(int i = 0; i < 10; i++)	System.out.println("i = "+i+","+(i<10)); 와 동일하다
		int i = 0;
		while(i < 10) {
			System.out.println("i = "+i+","+(i<10));
			i++;
		}
		
		
		sc.close();
		System.out.println("프로그램 종료.");	
		
		//범위가 정해져있으면 for문, 범위에 어떤 값이 들어올지 모르면 while문을 사용하는게 좋다
		 
		
		
		
		
	}
}
