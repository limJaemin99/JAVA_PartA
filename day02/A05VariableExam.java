package partA.day02;


// 변수 활용 연습
/*문제 : 어떤 학생의 중간고사 총점은 322, 과목수는 4개 입니다.
*		모두 항상 정수입니다. 이 학생의 평균을 구하려고 합니다.
*		변수는 총점은 sum, 과목개수는 count로 합니다.
*		평균을 계산합니다.
*		1) 평균 저장 변수를 정수 avgInt
*		2) 평균 저장 변수를 실수 avgDouble 로 각각 해보세요
*		3) 계산한 1), 2)를 각각 출력 합니다. 이때 오류가 생길까요?
*/
public class A05VariableExam {
	public static void main(String[] args) {
		
		int sum = 322;
		int count = 4;
		int avgInt = sum / count;
		double avgDouble = sum / count;
		
		System.out.println("평균 점수 (정수) : " + avgInt);
		System.out.println("평균 점수 (실수) : " + avgDouble);
		
		int sum1;
		int count1;
		int avgInt1;
		double avgDouble1;
		
		sum1 = 322;
		count1 = 4;
		avgInt1 = sum1/count1;
		System.out.println("평균 점수 (정수) : " + avgInt1);
		avgDouble1 = (double)sum1/count1;
		System.out.println("평균 점수 (실수) : " + avgDouble1);
		
		// sum/count 는 정수연산으로 결과는 80. 이 값이 double 변수에 저장되면서 .0만 생긴다.
		// sum 또는 count 중 하나를 실수값으로 바꾸어서 나눗셈을 하면 결과가 80.5가 나옴.
		
		int sum2 = 322;
		double count2 = 4;
		int avgInt2 = (int)(sum2/count2);
		double avgDouble2 = sum2/count2;
		
		System.out.println("평균 점수 (정수) : " + avgInt2);
		System.out.println("평균 점수 (실수) : " + avgDouble2);
		
	}//main
}//class
