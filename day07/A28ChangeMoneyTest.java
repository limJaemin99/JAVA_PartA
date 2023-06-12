package partA.day07;

import java.util.Scanner;

public class A28ChangeMoneyTest {
	public static int choice;
	public static int won;
	public static int percent, percentWon;
	public static boolean end = true;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double changeYen;
		double changeDollar;
		double oneYenWon = 1000.86/100;		//네이버 환율 계산기 100엔을 기준으로 표시
		double oneDollarWon = 1338.5;		//네이버 환율 계산기 1달러를 기준으로 표시
		double useYen;
		double useDollar;
		
		System.out.println("보유중인 금액(원)을 입력해주세요.");
		won = sc.nextInt();
		ChangeMoney.percent();
		
		
		System.out.println(":::::일본 여행 출국하기 전:::::");
		changeYen = ChangeMoney.wonToYen(won, oneYenWon);
		System.out.println("*보유중인 금액 "+won+"원을 환전한 금액 : " + changeYen + "엔 입니다.*");
		
		System.out.println();
		
		System.out.println("일본에서 사용한 금액(엔)을 입력해주세요.");
		useYen = sc.nextDouble();
		double temp = changeYen-useYen;
		System.out.println("한국 입국 후 남은 금액 : "+temp+"엔");
		
		System.out.println();
		
		System.out.println(temp+"엔을 원화로 환전하면 "+ChangeMoney.yenToWon(temp, oneYenWon)+"원 입니다.");
		won = ChangeMoney.yenToWon(temp, oneYenWon);
		
		System.out.println();
		
		while(end) {
		System.out.println("1.남은 돈으로 미국여행을 간다\t2.환전할 돈을 다시 입력한다.");
		choice = sc.nextInt();
		switch(choice) {
		case 1 : 
			System.out.println("남은 금액 : "+won+"원");
			end = false;
			break;
		case 2 : 
			won = 0;
			System.out.println("새롭게 보유중인 금액(원)을 입력해주세요.");
			won = sc.nextInt();
			end = false;
			break;
		default:
			System.err.println("잘못 입력하셨습니다.");
		}
		}
		
		System.out.println();
		
		ChangeMoney.percent();
			
		System.out.println();
			
		System.out.println(":::::미국 여행 출국하기 전:::::");
		changeDollar = ChangeMoney.wonToDollar(won, oneDollarWon);
		System.out.println("*보유중인 금액 "+won+"원을 환전한 금액 : "+changeDollar+"달러 입니다.*");
		
		System.out.println();
		
		System.out.println("미국에서 사용한 금액(달러)를 입력해주세요.");
		useDollar = sc.nextDouble();
		temp = changeDollar-useDollar;
		System.out.println("한국 입국 후 남은 금액 : "+temp+"달러");
		
		System.out.println();
		
		System.out.println(temp+"달러를 원화로 환전하면 "+ChangeMoney.dollarToWon(temp, oneDollarWon)+"원 입니다.");
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}
}
