package partA.day05;

import java.util.Scanner;

public class A19Nof2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//곱셈을 반복할때 결과값 저장할 변수의 초기값을 주의해서 정해야한다
		int result=1;	//곱셈 수식은 초기값 => 1
		int i;
		int num;
		
		System.out.println("2의 n제곱을 구하는 수식");
		System.out.println("n 값을 입력하세요");
		num = sc.nextInt();
		for (i = 0; i < num; i++) {	//3번 실행됨	>>	result = 2*2*2	>>	2³ = 8
			result *= 2;				//반복되는 수식에 제어변수 i를 사용하지 않는다	>>	rsult = result*2
			System.out.println("2의 "+i+"제곱 진행중 … "+result);
		}
		System.out.println("2의 "+i+"제곱은 "+result+"입니다.");
		
	}
}
