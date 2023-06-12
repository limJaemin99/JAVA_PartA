package partA.day06;

import java.util.Iterator;

//메소드 형식 연습 : 자바의 Math 클래스를 예시로 합니다.
public class A25MathTest {
	public static void main(String[] args) {
		
		
		System.out.println("1.최대값 max, 최소값 min 구하기");
		System.out.println("Math.max(56, 12) = "+Math.max(56, 12));
		System.out.println("Math.max(56.34, 99.123) = "+Math.max(56.34, 99.123));
		
		int min = Math.min(45, 56);
		double dminEx = Math.min(45, 56);	//자동 캐스팅
		double dmin = Math.min(56.78, 111.44);
		int imin = (int)Math.min(56.78, 111.44);	//강제 캐스팅
		
		System.out.println("Math.min(45, 56) = "+min);
		System.out.println("Math.min(56.78, 111.44) = "+dmin);
		
		//3개의 값 - 45,78,33 - 중 가장 큰 값, 가장 작은 값
		int a=45, b=78, c=33;
		
		System.out.println("a=45,b=78,c=33 중 가장 큰 값 = "+Math.max(a, Math.max(b, c)));
		System.out.println("a=45,b=78,c=33 중 가장 작은 값 = "+Math.min(a, Math.min(b, c)));
		
		System.out.println();
		
		System.out.println("2.반올림 round, rint");
		//round : double ▶ long / float ▶ int
		//rint : double ▶ double
		System.out.println("Math.round(3.141519) = "+Math.round(3.141519));
		System.out.println("Math.round(3.14) = "+Math.round(3.14));
		System.out.println("Math.round(5.64) = "+Math.round(5.64));
		System.out.println("Math.round(3.5) = "+Math.round(3.5));
		System.out.println("Math.rint(3.5) = "+Math.rint(3.5));
		System.out.println("Math.rint(-3.5) = "+Math.rint(-3.5));
		//해결 : 3.141519를 소수점 3번째 자리까지로 반올림하세요
		//1000으로 나누면 X >>> 정수/정수 = 정수, 정수/실수 = 실수 계산이 됨
		//Math.round(3.123*1000)/1000	<<<<< 밖에서 나눠줘야함
		System.out.println("Math.round(3.141519*1000)/1000.0 = "+Math.round(3.141519*1000)/1000.0);
		System.out.println("Math.round(3.141519*1000)/1000 = "+Math.round(3.141519*1000)/1000);

		//직접 해보세요
		
		//1231, 1236 을 10의자리까지 반올림
		//	▶ 나누기(/) 먼저 하고 곱하기(*)
		
		System.out.println();
		
		System.out.println("3.올림 ceil");
		System.out.println("Math.ceil(3.141519) = "+Math.ceil(3.141519));
		System.out.println("Math.ceil(3.14) = "+Math.ceil(3.14));
		System.out.println("Math.ceil(5.64) = "+Math.ceil(5.64));
		System.out.println("Math.ceil(3.5) = "+Math.ceil(3.5));
		System.out.println("Math.ceil(3.5) = "+Math.ceil(3.5));
		System.out.println("Math.ceil(-3.5) = "+Math.ceil(-3.5));
		
		System.out.println();
		
		System.out.println("4.내림 floor");
		System.out.println("Math.floor(3.141519) = "+Math.floor(3.141519));
		System.out.println("Math.floor(3.14) = "+Math.floor(3.14));
		System.out.println("Math.floor(5.64) = "+Math.floor(5.64));
		System.out.println("Math.floor(3.5) = "+Math.floor(3.5));
		System.out.println("Math.floor(3.5) = "+Math.floor(3.5));
		System.out.println("Math.floor(-3.5) = "+Math.floor(-3.5));
		
		System.out.println("5.난수(컴퓨터가 만들어주는 임의의 값)");
		System.out.println("Math.random = "+Math.random());
		System.out.println("Math.random = "+Math.random());
		System.out.println("Math.random = "+Math.random());
		System.out.println("Math.random = "+Math.random());
		System.out.println("Math.random = "+Math.random());
		System.out.println("Math.random = "+Math.random());
		// 0 < 난수 < 1		▶		로또값처럼 1 <= 로또번호 <= 45
		// 원래 범위에 0 < 난수*45 < 45		▶		다시 +1하면 1 < 난수*45+1 < 46
		
		for (int i = 0; i < 6; i++) {
			double d = Math.random()*45+1;
			int rnd = (int)d;
			System.out.println(d);
			System.out.println(rnd);
					
					
		}
		
		
	}
}
