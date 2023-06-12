package partA.day04_week2;

import java.util.Scanner;

//A08 예제를 for문으로 바꾸기
public class A17AlphabetPrintFor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1. 제어변수 타입을 int로 하기");
		char startA = 'A';
		char finishZ = 'Z';
		int countAZ = finishZ - startA + 1;

		for (int i = 0; i < countAZ; i++) {
			System.out.print((char)(startA++));		//System.out.print((char)(startA+i));
		}
		
		System.out.println();
		
		for (int i = 0; i < countAZ; i++) {
			System.out.print((char)(finishZ--));	//System.out.print((char)(finishZ-i));
		}
		
		System.out.println("\n2. 제어변수 타입을 char로 하기");
		for(char ch = 'a'; ch < 'z'; ch++) {
			System.out.print(ch);
		}
		
		System.out.println();
		
		for(char ch = 'z'; ch > 'a'; ch--) {
			System.out.print(ch);
		}
		
		
		System.out.println("\n3. 대문자 이어서 소문자 출력하기 A~Za~z");
		for (char ch = 'A'; ch < 'z'; ch++) {
			if(ch>=91 && ch<=96) {
				continue;
			}
			System.out.print(ch);		//ch가 91~96(특수문자)일때는 출력하지 않습니다.
		}
		
		System.out.println();
		//선생님 답변
		for (char ch = 'A'; ch < 'z'; ch++) {
			if(!(ch>=91 && ch<=96)) {
				System.out.print(ch);		//ch가 91~96(특수문자)일때는 출력하지 않습니다.
			}
		}
		
		
		
		
		System.out.println("\n---------------------------------------------");
		
		
		
		
		
		char start = 'A';
		char finish = 'Z';
		int count = finish - start + 1;
		char start2 = 'a';
		char finish2 = 'z';
		int count2 = finish2 - start2 + 1;
		int choice;
		int choice2;
		
		System.out.println("1) 나열할 알파벳 형태를 고르세요.");
		System.out.println("1. 대문자 | 2. 소문자");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("2) 나열할 방법을 고르세요.");
			System.out.println("1. A ▶ Z | 2. Z ▶ A");
			choice2 = sc.nextInt();
			switch(choice2) {
				case 1:
					for (int i = 0; i < count; i++) {
						System.out.print((char)(start++));
					}
					break;//switch2-1 case1 end
				case 2:
					for (int i = 0; i < count; i++) {
						System.out.print((char)(finish--));
					}
					break;//switch2-1 case2 end
				default :
					System.out.println("잘못 입력하셨습니다.\n");
					break;//switch2-1 default end
				}
				break;//switch1 default end
		case 2:
			System.out.println("2) 나열할 방법을 고르세요.");
			System.out.println("1. a ▶ z | 2. z ▶ a");
			choice2 = sc.nextInt();
				switch(choice2) {
				case 1:
					for (int i = 0; i < count2; i++) {
						System.out.print((char)(start2++));
					}
					break;//switch2-2 case1 end
				case 2:
					for (int i = 0; i < count2; i++) {
						System.out.print((char)(finish2--));
					}
					break;//switch2-2 case2 end
				default :
					System.out.println("잘못 입력하셨습니다.\n");
					break;//switch2-2 default end
				}
				break;//switch1 case2 end
		default :
			System.out.println("잘못 입력하셨습니다.\n");
			break;//switch1 default end
		}
		
		
		
	}
}
