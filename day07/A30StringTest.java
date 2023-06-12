package partA.day07;

import java.util.Scanner;

public class A30StringTest {
	//A29클래스에서 연습한 String 메소드 활용해보기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numericcount=0;		//숫자
		int upperCaseCount=0;	//대문자
		int lowerCaseCount=0;	//소문자
		String message;

		//프로그램 사용자에게 메시지를 입력받아서
		System.out.print("보낼 메시지를 입력하세요.\n☞");
		message = sc.nextLine();
		//총 길이를 구해서 알려주고
		System.out.println("당신이 입력한 메시지의 문자 갯수는 "+message.length()+"입니다.");
		//대문자/소문자/숫자가 각각 포함된 개수를 알려주기
		for (int i = 0; i < message.length(); i++) {
			char ch = message.charAt(i);
			if(isUpper(ch)) upperCaseCount+=1;
			if (isLower(ch)) lowerCaseCount+=1;
			if (isNumeric(ch)) numericcount+=1;
		}
		System.out.println("당신의 메시지는\n대문자 "+upperCaseCount+"개,\n소문자 "+lowerCaseCount+"개,\n숫자 "+numericcount+"개 입니다.");
		
		
		
	}//main end

	private static boolean isUpper(char ch) {
		return ch>='A'&&ch<='Z';
	}
	private static boolean isLower(char ch) {
		return ch>='a'&&ch<='z';
	}
	private static boolean isNumeric(char ch) {
		return ch>='0'&&ch<='9';
	}
	
	
	//한글은 '가' ~ '힣'	>> isHangul
	//특수문자 ' '~'/' 또는 ':'~'@' 또는 '['~'`' 또는 '{'~'~'	>> isSymbol
	
	
}//class end
