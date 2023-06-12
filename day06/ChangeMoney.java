package partA.day06;

import java.util.Scanner;

public class ChangeMoney {
	/*main 메소드는 만들지 않습니다. => MyUtility 클래스처럼 사용하기 위한 목적입니다.
	 * 확전금액 구하기 메소드 만들어보세요.
	 * 
	 * 메소드 인자는 2개 : int 바꿀금액, double 환율
	 * 리턴값 : double 환전된 금액. 소수점 1자리로 반올림
	 * 
	 * 일본 : 원화 <-> 엔화	wonToyen , yenTowon메소드
	 * 미국 : 원화 <-> 달러화 wonTodollar, dollarTowon 메소드
	*/
	public static final double yen = 9.87;
	public static final double dollar = 1324.5;//환율
	public static int won;
	public static int money;
	
	public static void changeMoney(int won) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		boolean end = true;
		
		switch(money) {
		case 1: 
			while(end) {
				System.out.println("원화(krw)를 선택하셨습니다.");
				System.out.println("환전할 방법을 고르세요.");
				System.out.println("1.원화▶엔화 2.원화▶달러");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					wonToyen();
					end = false;
					break;
				case 2:
					wonTodollar();
					end = false;
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			}
		case 2:
			System.out.println("엔화(yen)를 선택하셨습니다.");
			System.out.println(money+"엔을 원화로 환전합니다.");
			yenTowon();
			end = false;
			break;
		case 3:
			System.out.println("달러(usd)를 선택하셨습니다.");
			System.out.println(money+"달러를 원화로 환전합니다.");
			dollarTowon();
			end = false;
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		}
		
		
		
		
//		while(end) {
//		System.out.println("환전할 방법을 고르세요.");
//		System.out.println("1.원화▶엔화 2.엔화▶원화 3.원화▶달러 4.달러▶원화");
//		choice = sc.nextInt();
//		switch(choice) {
//		case 1:
//			wonToyen();
//			end = false;
//			break;
//		case 2:
//			yenTowon();
//			end = false;
//			break;
//		case 3:
//			wonTodollar();
//			end = false;
//			break;
//		case 4:
//			dollarTowon();
//			end = false;
//			break;
//		default :
//			System.out.println("잘못 입력하셨습니다.");
//			break;
//		}
//		}
//		
//		
//	}//changeMoney end
	
	public static void wonToyen() {
		System.out.println(money+"원을 엔화로 환전합니다.");
		System.out.print("원화▶엔화 환전 결과 : ");
		System.out.println(Math.rint((won/yen*10))/10);
		
		
	}//원화 >> 엔
	
	public static void yenTowon() {
		System.out.println("엔화▶원화 환전 결과 : ");
		System.out.println(Math.rint((money*yen*10))/10);
	}//엔 >> 원화
	
	public static void wonTodollar() {
		System.out.println(money+"원을 달러로 환전합니다.");
		System.out.println("원화▶달러 환전 결과 : ");
		System.out.println(Math.rint((won/dollar*10))/10);
	}//원화 >> 달러
	
	public static void dollarTowon() {
		System.out.println("달러▶원화 환전 결과 : ");
		System.out.println(Math.rint((money*dollar*10))/10);
	}//달러 >> 원화
	
	
	
	
}
