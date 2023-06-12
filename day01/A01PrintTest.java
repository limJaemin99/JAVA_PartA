package partA.day01_week1;

import java.util.Iterator;

//패키지 이름은 com.naver.api 과 같은 도메인주소 형식입니다.


//보라색은 예약어(키워드)
public class A01PrintTest {	//개발자가 만든 클래스
	public static void main(String[] args) {	//실행을 위해 필요한 메소드. main은 메소드 이름
		System.out.println(":::::첫번째 연습 - 표준출력:::::");
		System.out.println("*출력문 연습 : 큰 따옴표 기호안에 출력하고싶은 문자열을 작성한다.*");
		System.out.println("1. 클래스 이름 A01PrintTest 은 소스파일명과 동일해야한다.");
		aboutClass();	//개발자가 정의한 메소드 실행(호출)
		System.out.println("2. main 은 \"프로그램을 실행하는 기능\"으로 정해진 메소드 이름이다.");
		System.out.println("3. system 은 자바에서 만들어놓은 클래스이다. jdk에 포함된다");
		aboutSystem();
		System.out.println();
		System.out.println("===== 메소드로 만들면 코드 재사용이 됩니다 =====");
		aboutClass();
		aboutSystem();
	}
	
	public static void aboutClass() {	// aboutClass 이라는 이름의 메소드 정의 : 개발자가 정한 이름
		System.out.println("- 클래스는 여러 기능을 갖기위해 필요한 메소드를 정의한다.");
		System.out.println("- 클래스의 이름은 대문자로 시작한다. (Rule)");
		System.out.println("- 메소드의 이름은 소문자로 시작하고 괄호 ()가 따라온다. (Rule)");
	}

	public static void aboutSystem() {
		System.out.println("- System 은 운영체제를 통해 얻을수 있는 기능과 정보를 제공하는 자바의 클래스이다.");
		System.out.println("- out 은 System 클래스의 구성요소로 출력과 관련된 특징과 기능을 갖는다.");
		System.out.println("- println은 out이 갖고있는 메소드(기능)이다.");
		System.out.println("- System 은 out 을, out은 println을 구성요소로 포함하고있다.");
		System.out.println(" 명령으로 작성할때 .(dot)기호로 포함관계를 표시한다.");
	}
	
 
}
