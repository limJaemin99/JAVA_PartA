package partA.day05;


public class A24MySampleMethod {
	public static void main(String[] args) {
		
		int result;
		
		result = sumToN(23);
		System.out.println("1~23 까지의 합 : " + result);
		
		result = sumToN(100);
		System.out.println("1~100 까지의 합 : " + result);
		
		
		result = sumThreeNumber(5,6,7);
		System.out.println("3개 정수값의 합 : "+result);
		
		
		System.out.println("3개 실수값의 합 : "+sumThreeDouble(3.4,5.6,7.7));
		double d1 = 3.14;
		double d2 = 3.141;
		double d3 = 3.1419;
		
		System.out.println("3개 실수 d1+d2+d3 = "+sumThreeDouble(d1, d2, d3));
		
	//참고 : System.out.println에서 println 메소드는 문자열을 1개 받아서 처리하고
	//		리턴값은 없는 메소드입니다.
	//정리 : 메소드 인자는 0,1,2,3,....개 모두 가능하고
	//		리턴값 개수는 0 또는 1 입니다.
		
		
//리턴이 없고, 인자는 0 또는 1 입니다. 메소드는 0이면 대문자 A~Z, 1이면 소문자 a~z 출력
		alphabetPrint(0);
		alphabetPrint(1);
		
		//문자 'A'에 아스키코드값 구해서 리턴받기
		char ch='A';
		int code=ascii(ch);
		System.out.println("문자 = " + ch + ", 아스키코드 = " + code);
		
		code = 67;
		char ch2 = toChar(code);
		System.out.println("아스키코드 = " + code + ", 문자 = " + ch);
		
	}//main end
	
	/*메소드 실행 순서
	 * 1. 인자값 23 또는 100을 매개변수에 전달합니다. >> sumToN 매개변수 n이 저장합니다.
	 * 2. 메소드를 인자값으로 실행합니다. sum이 구해집니다.
	 * 3. 구해진 결과 sum을 메소드 호출한 곳으로 전달합니다. >> return
	*/
	
	public static char toChar(int code) {
		return (char)code;
	}
	
	
	public static int ascii(int ch) {
		return ch;
		
	}
	
	
	private static void alphabetPrint(int i) {
		char start = 'A';
		if(i==1) start = 'a';
		
		for(char ch=start;ch<start+26;ch++) {	//i값에 따라 start가 결정됩니다.
			System.out.print(ch+" ");			//마지막 값은 알파벳 26개이므로 start+26
		}
		System.out.println();
	}
	
	
	private static double sumThreeDouble(double d, double e, double f) {
		return d+e+f;
	}
	
	private static int sumThreeNumber(int i, int j, int k) {
		return i+j+k;
	}
	
	
	
	public static int sumToN(int n) {	//void??	//n 오류??
		
		int sum=0;
	
		
		for (int i = 1; i < n; i++) {
			sum+=i;
		}
		//sum은 1부터 n까지의 합
		return sum;
		
		
	}//SumToN end
	
}
