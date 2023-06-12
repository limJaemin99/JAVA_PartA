package partA.day06;

public class A26MyUtilityTest {
	
	public static void main(String[] args) {
		
		//MyUtility의 static 즉, 클래스 메소드를 테스트합니다.	>> 사용방법은 클래스이름.메소드()
		//	▶private은 다른 클래스에서 사용할 수 없는 접근 제한입니다.
		//		ex) MyUtility.ascii('A');
		
		MyUtility.alphabetPrint(0);
		MyUtility.alphabetPrint(1);
		
		double result=MyUtility.sumThreeDouble(3, 4, 5.2);
		System.out.println(result);
		
		//메소드는 클래스의 구성요소인 '동작'(데이터 처리) 입니다.
		//필드는 클래스의 구성요소인 '특성'(데이터)을 나타내는 변수입니다.
		System.out.println("MyUtility 필드 TEST 값 = "+MyUtility.TEST);
		System.out.println("MyUtility 필드 TEMP 값 = "+MyUtility.TEMP);
		
		MyUtility.TEST = 1234;
//		MyUtility.TEMP = 1234;	//오류 : final변수는 값을 바꿀 수 없다.		MyUtility에 설명 있음
								//public static final은 상수(변하지 않는 값)
		
		System.out.println("MyUtility 필드 TEST 값 = "+MyUtility.TEST);
		
	}
	
}
