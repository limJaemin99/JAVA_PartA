package partA.day07;

import java.util.Scanner;

public class ChangeMoney {

	public static double wonToYen(int won, double oneYenWon) {
		return Math.rint((won/oneYenWon*10))/10;
		
	}
	
	public static int yenToWon(double temp, double oneYenWon) {
		return (int)(Math.rint(temp*oneYenWon));
	}
	
	public static double wonToDollar(int won, double oneDollarWon) {
		return Math.rint((won/oneDollarWon*10))/10;
		
	}
	
	public static int dollarToWon(double temp, double oneDollarWon) {
		return (int)(Math.rint(temp*oneDollarWon));
	}
	
	
	
	
	public static void percent() {
		Scanner sc = new Scanner(System.in);
		while(A28ChangeMoneyTest.end) {
			System.out.println("보유중인 금액 중 얼마를 환전하시겠습니까?");
			System.out.println("1.10% 2.30% 3.50% 4.100% 5.직접 입력");
			A28ChangeMoneyTest.choice=sc.nextInt();
			switch(A28ChangeMoneyTest.choice) {
			case 1:
				A28ChangeMoneyTest.percentWon = (int)(A28ChangeMoneyTest.won*0.1);
				System.out.println("환전할 금액 : "+A28ChangeMoneyTest.percentWon+"원");
				A28ChangeMoneyTest.won = A28ChangeMoneyTest.percentWon;
				A28ChangeMoneyTest.end = false;
				break;
			case 2:
				A28ChangeMoneyTest.percentWon = (int)(A28ChangeMoneyTest.won*0.3);
				System.out.println("환전할 금액 : "+A28ChangeMoneyTest.percentWon+"원");
				A28ChangeMoneyTest.won = A28ChangeMoneyTest.percentWon;
				A28ChangeMoneyTest.end = false;
				break;
			case 3:
				A28ChangeMoneyTest.percentWon = (int)(A28ChangeMoneyTest.won*0.5);
				System.out.println("환전할 금액 : "+A28ChangeMoneyTest.percentWon+"원");
				A28ChangeMoneyTest.won = A28ChangeMoneyTest.percentWon;
				A28ChangeMoneyTest.end = false;
				break;
			case 4:
				A28ChangeMoneyTest.percentWon = A28ChangeMoneyTest.won;
				System.out.println("환전할 금액 : "+A28ChangeMoneyTest.percentWon+"원");
				A28ChangeMoneyTest.won = A28ChangeMoneyTest.percentWon;
				A28ChangeMoneyTest.end = false;
				break;
			case 5:
				System.out.println("환전할 금액의 비율(%)을 입력해주세요. (1단위)");
				A28ChangeMoneyTest.percent = sc.nextInt();
				A28ChangeMoneyTest.percentWon = A28ChangeMoneyTest.won*A28ChangeMoneyTest.percent/100;
				System.out.println("환전할 금액 : "+A28ChangeMoneyTest.percentWon+"원");
				A28ChangeMoneyTest.won = A28ChangeMoneyTest.percentWon;
				A28ChangeMoneyTest.end = false;
				break;
			default:
				System.err.println("잘못 입력하셨습니다.");
				break;
			}
			}
			A28ChangeMoneyTest.end = true;
	}
	
	
	
	
	
	
	
	
}//class end
