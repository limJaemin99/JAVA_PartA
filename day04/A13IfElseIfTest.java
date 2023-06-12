package partA.day04_week2;

import java.util.Scanner;

// if ~ else if ~ else if ~ ……
public class A13IfElseIfTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		for(int i = 0; ; i++) {
		System.out.println("::::: 쇼핑몰 사용자 마이페이지 :::::");
		System.out.println("1. 장바구니\t2. 찜 상품\t3. 배송조회\t4. 구매내역\t5. 종료");
		System.out.print("선택하세요. >>>> ");
		menu = sc.nextInt();
		if(menu == 1) {
			System.out.println("장바구니 입니다.");
			break;
		} else if(menu == 2) {
			System.out.println("찜 상품 입니다.");
			break;
		} else if(menu == 3) {
			System.out.println("배송조회 입니다.");
			break;
		} else if(menu == 4) {
			System.out.println("구매내역 입니다.");
			break;
		} else if(menu == 5) {
			System.out.println("종료합니다.");
			break;
		} else {
			System.out.println("잘못 입력하셨습니다.\n");
		}
		}
		
		System.out.println("메뉴 선택을 종료합니다.");
		
		// 동일한 값인지 비교 : 관계연산자 == 또는 !=1
		
		// char와 관련된 연습으로 아스키코드 정수값 입력 0 ~ 127 범위로 받으세요
		// 입력받은 값으로 아래 4개중 하나로
		
		// - 대문자
		// - 소문자
		// - 숫자
		// - 특수문자
		
		int num;
		char result;
		
		System.out.println("-----------------------------------------");
		while(true) {
		//1) 정수 입력받기
		System.out.println("0 ~ 127 사이의 정수를 입력하세요.");
		num = sc.nextInt();
		//2) 정수 분리하기
		if(num >= 65 && num <= 90) {
				System.out.println("대문자입니다.");
				break;
			} else if (num >= 97 && num <= 122) {
				System.out.println("소문자입니다.");
				break;
			} else if (num >= 48 && num <= 57) {
				System.out.println("숫자입니다.");
				break;
			} else if (num > 127 || num < 0){
				System.out.println("잘못 입력하셨습니다.");
			} else {
				System.out.println("특수문자입니다.");
				break;
			}//if문 종료
		}//while(true) 종료
		
		//3) 정수를 문자로 변환하기
		result = (char)num;
		System.out.println("입력한 정수에 해당하는 문자 : " + result);
		
	}//main 종료
}// class 종료
