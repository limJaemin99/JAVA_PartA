package partA.day10;

import java.util.Arrays;

//call by value : 메소드 인자로 데이터 값을 전달. 메소드 인자가 원시타입
//call by reference : 메소드 인자로 객체의 참조값을 전달. 메소드 인자가 배열 또는 클래스타입
public class A40CallByRef {
	public static void main(String[] args) {
		
		int test = 100;		//◀ test는 changeTest 안의 test와 다른애임 (각자 메소드에서 따로 운영)
		changeTest(test);
		System.out.println("changeTest 실행 후 test = "+test);
		
		int[] intArr = {1,2,3,4,5};
		changeIntArr(intArr);
		System.out.println("changeIntArr 실행 후 intArr = "+Arrays.toString(intArr));
		
		
		String temp = "hello";
		changeString(temp);
		System.out.println("changeString 실행 후 main 지역변수 temp = "+temp);
		
		//String 불변객체인가 확인
		String temp2 = "hello";		//"hello"문자열 객체 이미 있으니 다시 생성 안함
		System.out.println(temp.hashCode());	//객체의 해시코드값은 10진수로 출력
		System.out.println(temp2.hashCode());
		System.out.println("★★★temp == temp2 ? "+(temp==temp2));
		System.out.println("★★★temp.equals(temp2) ? "+temp.equals(temp2));
		
		
		//"hello"가 이미 있지만 그래도 새로 만들 경우 <new String 사용>
		String temp3 = new String("hello");
		System.out.println(temp.hashCode());	//객체의 해시코드값은 10진수로 출력
		System.out.println(temp3.hashCode());
		System.out.println("★★★temp == temp3 ? "+(temp==temp3));			//해시코드값은 다르고
		System.out.println("★★★temp.equals(temp3) ? "+temp.equals(temp3)); //객체의 값은 같다.
		//문자열 해시코드값은 문자열 구성이 같으면 동일하도록 변경(override)되어있어 객체는 다르지만 해시코드값은 같다.
		
		
		
		
		//String temp2 = new String("hello");
		
	}//main end

	
	
	
	private static void changeString(String temp) {
		temp = temp.replace("ll", "**");	//문자열은 문자열 내용이 바뀌면 객체의 위치가 바뀐다.(★불변객체★)
												// =>temp의 참조값이 바뀜.
		System.out.println("changeString 메소드 지역변수 temp = "+temp);
	}


	private static void changeIntArr(int[] intArr) {
		intArr[3]=100;
	}//changeIntArr end
	
//	private static void changeIntArr(int[] temp) {
//		temp[3]=100;					   ↑↑↑↑
//	}	↑↑↑↑
	//이렇게 바꿔도 main에서의 결과는 똑같다
	//temp는 changeIntArr 메소드의 지역변수이다.
	//메소드가 changeIntArr(intArr); 실행될때 intArr배열의 참조값을 temp가 전달받아 저장한다.
	
	
	private static void changeTest(int test) {
		test = 200;			//◀ test는 main 안의 test와 다른애임 (각자 메소드에서 따로 운영)
	}//changeTest end

//	private static void changeTest(int abc) {
//		test = 200;					   ↑↑↑
//	}						바꿔도 main에서의 결과는 똑같다
	
	
	
	
}//class end
