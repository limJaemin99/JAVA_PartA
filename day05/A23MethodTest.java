package partA.day05;

public class A23MethodTest {
	
	
	
	public static void main(String[] args) {
		int result = methodA();
		System.out.println("methodA 실행 결과 : "+result);
		
//		result = methodAA();	>> main에서는 static만 사용가능 (methodAA는 static이 없음)
		
		methodB(425);
//		methodB(4.25);	>>	오류 : 매개변수의 형식과 실제 값의 형식이 불일치
//		result = methodB(425);	//오류 : 리턴값이 없는 메소드이므로 오류
		
	}//public main end
	
	
	
	
	
	//1) 리턴값이 있는 형식 예시 : 항상 정수값 1234를 리턴하는 메소드
	//private : 다른 클래스에서는 사용할 수 없다.
	private static int methodA() {	//리턴형식 : int	void면 return 없음
		return 1234;		//리턴형식 int와 일치하는 값을 return
//		return "1234"; >> 형식이 맞지 않으면 오류
//		return 12.34; >> 형식이 맞지 않으면 오류
	}//private methodA end

	
	//2) static (정적인) : (간단하게 설명하면) main은 꼭 static이다. static은 static끼리만 사용할 수 있다.
	//static이 없으면 인스턴스 메소드라고 합니다.
	public int methodAA() {
		return 1234;
	}
	
	
	//3) 인자가 있는 형식 예시 : 인자를 정수값을 1개 받아서 출력하기. 리턴은 없음(void).
	public static void methodB(int number) {	//int number가 메소드가 처리할 데이터(재료)
		//int number가 메섣,기 찰;힐 데이터(재료)를 저장합니다.
		//실제 데이터는 실행할 때 전달받습니다.
		System.out.println("number = "+number);
		//void일때는 값을 return하지않는다.
	}
	
	
	
	
}//class end
