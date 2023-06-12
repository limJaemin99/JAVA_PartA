package partA.day02;


// 문제 : 사각형의 세로는 항상 정수, 가로는 항상 실수
//		 현재 세로는 12cm이고 가로는 8.45cm 입니다
//		 가로 width 세로 height로 합니다
//		 넓이를 계산해서 출력해보세요
//		 1) 넓이 저장 변수를 정수 areaInt
//		 2) 넓이 저장 변수를 실수 areaDouble 로 각각 해보세요

public class A04DataExam {
	
	public static void main(String[] args) {
		
		int width = 12;
		double height = 8.45;
//		int areaInt = width * height;
		double areaDouble = width * height;
		
		System.out.println("넓이(실수) : " + areaDouble);
		System.out.printf("넓이(실수) : %.1f" , areaDouble);
		
		System.out.println();
		System.out.println();
//		int areaInt = width * height;	오류를 강제 캐스팅으로 실행하기
		int areaInt = (int)(width*height);
//		int areaInt = width*(int)height;
		System.out.println("넓이(정수) : " + areaInt);
		
		
	}//main
}//class
