package partA.day04_week2;

import java.util.Scanner;

//switch는 if조건식이 equal(==)을 여러번 검사하는 경우에 사용
//조건식에서 검사하는 값은 정수형(byte,short,int,long), 문자형(char), 문자열(String) 형식만 가능
public class A15SwitchTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 1;
		char ch;
		String st;
		int num;
		
		switch(menu) {
			case 1:		//menu == 1 ?
				System.out.println("1");
				break;	//아래의 명령어들을 실행하지 않고 switch{..}을 끝낸다
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5");
				break;
			default :
				System.out.println("잘못입력");
				break;
		}
		
		System.out.println("문장에서 문자 추출");
		st = sc.next();
		System.out.println("추출할 문자의 위치를 입력");
		num = sc.nextInt()-1;
		ch = st.charAt(num);
		switch(ch) {
			case 'A' :
				System.out.println("A");
				break;
			case 'B' :
				System.out.println("B");
				break;
			case 'C' :
				System.out.println("C");
				break;
			default :
				System.out.println("잘못 입력");
				break;
		}
		
		
		
	}
}
