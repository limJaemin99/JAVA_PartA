package partA.day06;

import java.util.Scanner;

public class ChangeMoneyTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		while(true) {
			System.out.println("입력할 화폐의 단위를 고르세요.");
			System.out.println("1.원 2.엔 3.달러");
			ChangeMoney.money = sc.nextInt();
			if(ChangeMoney.money==1||ChangeMoney.money==2||ChangeMoney.money==3) break;
			else System.err.println("잘못 입력하셨습니다.");}
		System.out.println("환전할 금액을 입력해주세요.");
		ChangeMoney.won = sc.nextInt();
		ChangeMoney.changeMoney(ChangeMoney.won);
	}
}
