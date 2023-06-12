package partA.day06;

import java.util.Scanner;

/*[[복습 예제]]
 요구사항 : 

0.메뉴는 프로그램 종료 전까지 반복됩니다.(while문과 switch로 구현하기)

1. 은행계좌의 잔고 balance 초기값 0

2. 메뉴 출력
System.out.println("-------------------------------");
System.out.println("  1:예금하기 | 2:출금하기 | 3:잔액 확인 | 4:프로그램 종료");
System.out.println("--------------------------------");

3. 예금은 변수 잔고 balance 에 예금하기(+예금금액 money)
   출금은 변수 잔고 balance 에 출금하기(-출금금액 money) 단, 잔고가 부족하면 출금 못함.
	>>예금 또는 출금 실행 후 잔액 보여주기
	
4. 예금과 출금은 money 금액 사용자 입력이 필요합니다.
*/
public class A27ReviewBanking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 은행계좌의 잔고 balance 초기값 0
		int balance=0;
		int money;
		int choice;
		boolean status = true;
		
		
		while(status) {
		//2. 메뉴 출력
		menu();
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("예금할 금액을 입력하여주십시오.");
			money = sc.nextInt();
			balance += money;
			System.out.println("입금 후 잔액은 "+balance+"원 입니다. 감사합니다.\n");
			break;
		//case 1 end	
			
		case 2:
			System.out.println("출금할 금액을 입력하여주십시오.");
			money = sc.nextInt();
			if(balance < money) {
				System.out.println("현재 잔액보다 출금하려는 금액이 큽니다. 잔액을 확인 후 다시 거래해주세요.\n");
			} else {
				balance -= money;
				System.out.println("출금 후 잔액은 "+balance+"원 입니다. 감사합니다.\n");
			}
			break;
		//case 2 end	
			
		case 3:
			System.out.println("현재 잔액 : "+balance+"원\n");
			break;
		//case 3 end	
			
		case 4:
			System.err.println("거래를 종료합니다. 감사합니다.\n");
			status = false;
			break;
		//case 4 end
		default:
			System.err.println("올바른 번호를 골라주세요.\n");
			break;
		}
		
		
		
		}//while end
	}//main end
	
	public static void menu() {
		System.out.println("---------------------------------------------");
		System.out.println(" 1:예금하기 | 2:출금하기 | 3:잔액 확인 | 4:프로그램 종료");
		System.out.println("--------------------------------------------");
	}
	
	
	
	
}//class end
