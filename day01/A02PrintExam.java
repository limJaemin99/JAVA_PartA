package partA.day01_week1;

public class A02PrintExam {

	public static void main(String[] args) {
		System.out.println("::: 나의 소울푸드 :::");
		myFood();
		System.out.println();
		System.out.println("::: 나의 반려동물 :::");
		myAnimal();
		}
		
		public static void myFood() {
			// \n은 줄바꿈 기능의 문자
			System.out.println("치킨\n스파게티\n삼겹살");
			System.out.println("--tab으로 구분--");
			System.out.println("치킨\t스파게티\t삼겹살");
		}
		
		public static void myAnimal() {
			System.out.println("도마뱀\n개구리\n강아지");
			System.out.println("--tab으로 구분--");
			System.out.println("도마뱀\t개구리\t강아지");
		}
		
}

//오류수정 단축키 : Ctrl + 1
