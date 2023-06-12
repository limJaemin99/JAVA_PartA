package partA.day02;

public class A06DoubleFloatTest {
	public static void main(String[] args) {
		
		double dnum = 1.1234567890123456789;
		float fnum = 1.1234567890123456789f;	// float 에 저장할 데이터는 리터럴에 f 추가 필수
		double dnum2 = 1.1234567890123456789f;	// 4byte 실수를 8byte 변수로 자동캐스팅
		
		System.out.println("double 변수 값 출력은 소수점 이하 자리수 최대 16자리");
		System.out.println("double 1.1234567890123456789 : " + dnum);
		System.out.println("float 변수 값 출력은 소수점 이하 자리수 최대 7자리");
		System.out.println("float 1.1234567890123456789f : " + fnum);
		
		System.out.println();
		
		System.out.println("지수 형식 2E3 : " + 2E3);		// E3은 10의 3승
		System.out.println("지수 형식 2E-3 : " + 2E-3);	// E-3은 -10의 3승
		
		System.out.println();
		
		System.out.println("실수는 부동소수점형식 연산을 하는 과정에서 때로 값의 오류가 발생한다/");
		System.out.println("ex) 0.1 + 1.6 = ? " + (0.1+1.6));	// 최우선연산자 == ()
//		System.out.println("0.1 + 1.6 = ? " + (0.1+1.6));	// 덧셈 안하고 문자열 연결로 실행
		
		System.out.println(3.0/0.0);	// 실수 0.0으로 나눈 결과		>>	무한대 Infinity
		System.out.println(0.0/0.0);	// 실수 0.0을 0.0으로 나눈 결과	>>	Not a Number (NaN)
		System.out.println(0.0/3.0);	// 실수 0.0을 나눈 결과			>>	결과값 0.0
//		System.out.println(3/0);		// Exception(예외)오류 == 실행 오류, 정수는 0으로 나눌 수 없다		
		
		System.out.println();
		
		System.out.println("::::: int 와 long 타입 :::::");
		int data1 = 123;
		long data2 = 123;				// 자동 캐스팅		//	long 4byte
		long data3 = 2147483647;		// 자동 캐스팅		//	long 4byte
		long data4 = 2147483648L;		// long 8byte로 표현해야하는 큰 값은 리터럴에 L(l) 추가 필수
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		
		
		
		
		
		
	}//main
}//class
