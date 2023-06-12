package partA.day07;

import java.util.Scanner;

public class A29StringMethodTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문자열 데이터를 위한 변수 선언
		String name = "momo";
		String address = "Seoul";
		String message = "Hi~ Hello~!!";
		
		System.out.println("name = "+name);
		System.out.println("address = "+address);
		System.out.println("message = "+message);
		
		System.out.print("Welcome Message 를 입력하세요\n☞");
		message = sc.nextLine();
		System.out.println("보낸 메세지 = "+message);
		
		System.out.println("::::: String의 핵심기능 메소드 :::::");
		System.out.println("1. 문자열의 길이를 구해주는 메소드 .length()");
		System.out.println("message.length() = "+message.length());
		System.out.println("address.length() = "+address.length());
		System.out.println("name.length() = "+name.length());
		
		System.out.println("2. 문자열을 구성하는 문자들이 같은지 비교하는 메소드 - equals");
		System.out.println(name.equals("momo"));	//true
		System.out.println(name.equals("Momo"));	//false
		//name이 "momo"와 같은지 참 또는 거짓 리턴 boolean형식, 인자 1개 String 형식
		System.out.println(address.equals("Seoul"));	//true
		System.out.println(address.equals("seoul"));	//false
		//동등비교 기호(관계연산) : == , != 은 문자열의 내용을 비교할때는 사용 못한다.
							//원시타입만 사용 가능
		
		System.out.println("3. 대소문자 변환 메소드 - toUpperCase, toLowerCase");
		//리턴은 String 형식
		System.out.println(name.toUpperCase());		//MOMO
		System.out.println(address.toUpperCase());	//SEOUL
		System.out.println(name.toLowerCase());		//momo
		System.out.println(address.toLowerCase());	//seoul
		//참고 : 아래와 같은 원시타입 age는 메소드가 없음
//		int age = 23;
		
		System.out.println("4. 문자열의  특정 위치의 문자 1개를 가져오기 - charAt");
		//인자는 int 1개, 리턴타입은 char 1개
		int i=0;
		System.out.println("name.charAt(0) = "+name.charAt(i));
		i++;
		System.out.println("name.charAt(1) = "+name.charAt(i));
		i++;
		System.out.println("name.charAt(2) = "+name.charAt(i));
		i++;
		System.out.println("name.charAt(3) = "+name.charAt(i));
		
		
		
	}//main end
}//class end
