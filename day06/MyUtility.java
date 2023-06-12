package partA.day06;


public class MyUtility {
	//필드는 클래스의 구성요소인 '특성'(데이터)을 나타내는 변수 입니다.
	//위치를 고려하면 전역(global)변수
	//전역변수는 이 클래스 어디서나 쓸 수 있습니다. 
	//지역(local)변수는 일정 범위 내에서만 쓸 수 있습니다.
	public static final double VERSION = 1.1;
	//public static final은 상수.	대문자로 표기
	//public static final은 상수(변하지 않는 값)
	//상수는 변하지 않는 의미있는 값을 이름을 붙여준 것 입니다. 값을 변경할 수 없습니다.
	public static int TEST = 1111;
	public static final int TEMP = 9999;
	
	public static char toChar(int code) {
		return (char)code;
	}//toChar end
	
	
	private static int toAscii(char ch) {
	//private는 이 클래스의 다른 메소드가 사용하는것이 목적입니다.
		return ch;
		
	}//ascii end
	
	
	public static void alphabetPrint(int i) {
		char start = 'A';		//메소드의 지역(local)변수
		if(i==1) start = 'a';
		
		for(char ch=start;ch<start+26;ch++) {	//ch는 for문의 지역(local)번수
			System.out.print(ch+" ");			
		}
		System.out.println();
	}//alphabetPrint end
	
	
	public static double sumThreeDouble(double d, double e, double f) {
		return d+e+f;
	}//sumThreeDouble end
	
	public static int sumThreeNumber(int i, int j, int k) {
		return i+j+k;
	}//sumThreeNumber end
	
	
	
	public static int sumToN(int n) {
		
		int sum=0;
	
		
		for (int i = 1; i < n; i++) {
			sum+=i;
		}
		
		return sum;
		
		
	}//SumToN end
	
}
