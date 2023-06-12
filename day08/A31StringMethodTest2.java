package partA.day08;

import java.util.Scanner;

//두번째 String 메소드 연습 - 특정 문자열 안에서 찾기 기능
public class A31StringMethodTest2 {
	
	public static void main(String[] args) {
		String email = "koreait.sec2020@gmail.com";	//*마지막문자 m의 인덱스 = email.length()-1
		//1. contains
		System.out.println("1. contains - 특정 단어(문자열)가 포함되어 있는지 검색");
		
		System.out.println(email.contains("gmail"));	//"gmail"이 포함?
		System.out.println(email.contains("gmail!"));	//"gmail!"이 포함?	<< !추가
		
		//2. startswith/endswith
		System.out.println("2. startswith / endswith - 맨앞/맨뒤의 문자열 검색");
		
		System.out.println(email.startsWith("kor"));	//"kor"로 시작하는지?
		System.out.println(email.startsWith("com"));	//"com"으로 시작하는지?
		System.out.println(email.endsWith("kor"));		//"kor"로 끝나는지?
		System.out.println(email.endsWith("com"));		//"com"으로 끝나는지?
		//1,2번은 리턴타입이 boolean이므로 조건식에 사용
		
		//★★★★★★★★★★★★★★★★★★★★★★★★★[중요]★★★★★★★★★★★★★★★★★★★★★★★★★
		//3. indexOf/lastIndexOf
		System.out.println("\n3.indexOf, lastIndexOf - 찾는 문자열의 위치를 리턴");
		
		String message = "****korAbcd**korSecurity   kor!!! korea";
		System.out.println("01234567890123456789012345678901234567890");
		System.out.println(message);
		System.out.println(message.indexOf("kor"));		//"kor"문자열이 인덱스 몇번에서 시작하는지 리턴
		System.out.println(message.indexOf("korSec"));	//"korSec"문자열이 인덱스 몇번에서 시작하는지 리턴
		System.out.println(message.lastIndexOf("kor"));	//마지막에 위치한 "kor"의 위치를 리턴 
		System.out.println("반복해서 kor 찾기---------------");
		System.out.println(message.indexOf("kor",7));	//"kor"문자열을 7번 위치부터 찾아서 리턴
		System.out.println(message.indexOf("kor",16));	//"kor"문자열을 16번 위치부터 찾아서 리턴
		System.out.println(message.indexOf("kor",30));	//"kor"문자열을 30번 위치부터 찾아서 리턴
		System.out.println(message.indexOf("kor",37));	//"kor"문자열을 37번 위치부터 찾아서 리턴
		//찾는 문자열 "kor"이 정해진 범위의 문자열에서 없으면 -1 리턴
		
		//4. replace
		System.out.println("4. replace - 문자열 치환");
		System.out.println("kor을 모두 KOREA로 치환하는 예시");
		message = message.replace("kor", "KOREA");
		System.out.println("치환 결과 : "+message);
		
		//5. substring
		System.out.println("5. substring - 특정 범위로 문자열 추출");
		System.out.println(message.substring(22));		//인덱스 22부터 마지막까지
		System.out.println(message.substring(22,message.length()));		//인덱스 22부터 마지막까지
		System.out.println(message.substring(22,35));	//인덱스 22부터 34까지 (35포함 안함)	22 ≤ stirng < 35
		
		//종합 예시 - 위의 email에서 "@" 기준으로 앞에 문자열 => userid, 뒤에 문자열은 domain으로 저장하기
		//"koreait.sec2020@gmail.com"에서 userid는 koreait.sec2020 , domain은 gmail.com이 됩니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일을 입력하세요.\n☞");
		email = sc.nextLine();
		
		//@를 찾는것은 indexOf, 추출은 substring
		int temp=email.indexOf("@");
		String userid = email.substring(0,temp);
		String domain = email.substring(temp+1);
		System.out.println("아이디 : "+userid+"\n이메일 서버 도메인 : "+domain);
		
		
	}//main end
	
	
	
}//class end
