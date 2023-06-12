package partA.day09_week3;

import java.util.Scanner;

public class A37KeyInputParseInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		double height;

		//A36 해결방법 2 : 실제로 자주 사용하는 방식. 모든 키보드 입력은 nextLine()으로 한다.
		System.out.println("문자열 입력 후 정수 입력하는 예제");
		
		System.out.print("이름을 입력하세요.\n☞");
		name = sc.nextLine();
		
		System.out.print("나이를 입력하세요.\n☞");
		age = Integer.parseInt(sc.nextLine());
		//★★★★★nextInt 메소드를 nextLine 메소드로 입력받기 >> 정수로 변환(문자열의 " "가 제거된다고 생각하기)
		//ex) sc.nextLine()에서 입력 "23"을 정수 23으로 변환
		
		System.out.println("키를 입력하세요.\n☞");
		height = Double.parseDouble(sc.nextLine());
		
		System.out.println("이름 : "+name+", 나이 : "+age+", 키 : "+height);
		
		//결론 : 모든 키보드 입력을 문자열로 받아 원하는 형식으로 반환시키도록 한다.
				//앞으로 배울 여러가지 데이터 교환에서도 문자열이 기본입니다.
		
		//boolean, character, integer, long, double, ... 등등 원시타입에 대한 처리기능을 가진 Wrapper 클래스
		//String에서 int, double, long, ... 원시타입으로 변환 : Wrapper 클래스.parseXXXX("문자열");
		//int, double, long, ... 원시타입에서 String으로 변환 : String.valueOf(원시타입데이터);
		
		
		
		
		
		
		
		
		
	}//main end
}//class end
