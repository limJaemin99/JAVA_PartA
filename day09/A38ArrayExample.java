package partA.day09_week3;

import java.util.Random;
import java.util.Scanner;

//배열활용예제
public class A38ArrayExample {
	public static void main(String[] args) {
		int[] scores = {67, 45, 90, 83, 77};
		
		//scores배열에서 가장 큰값과 가장 작은값을 구하기 (sort 사용 X)
		int max = scores[0];	//최대값 저장 변수 초기화
		int min = scores[0];	//최소값 저장 변수 초기화
		
		for (int i = 1; i < scores.length; i++) {
			max = Math.max(max, scores[i]);
//			if (scores[i] > max) max = scores[i];
		}
		System.out.println("최대값 = "+max);
		
		for (int i = 1; i < scores.length; i++) {
			min = Math.min(min, scores[i]);
//			if(scores[i] < min) min = scores[i];
		}
		System.out.println("최소값 = "+min);
		
		System.out.println("배열 변수로 출력 = "+scores);	//[I@515f550a
		//[I@객체의 참조값을 나타내는 16진수 8자리, [I는 배열이고 다른 참조타입에서는 '패키지명.클래스명' 형식으로 나옴
		
		//↓주소값 예제(참고용)↓
		Scanner sc = new Scanner(System.in);
		System.out.println("참조타입 변수 sc 출력 = "+sc);
		Random rnd = new Random();
		System.out.println("참조타입 변수 rnd 출력 = "+rnd);
		
		
		
		int sum = 0;
		max = scores[0];
		min = scores[0];
		System.out.println("데이터를 여러개 저장하는 자료구조에서 사용되는 향상된 for문(for-each문)");
		for (int temp : scores) {	//scores배열에서 index순서로 1개씩 값을 가져와 temp에 저장
			System.out.println(temp);
			sum+=temp;
//			max = Math.max(max, temp);
			if(temp>max) max = temp;
//			min = Math.min(min, temp);
			if(temp<min) min = temp;
		}
		
		System.out.println("합계 = "+sum);
		System.out.println("최대값 = "+max);
		System.out.println("최소값 = "+min);
		
		
		
		
		
	}//main end
}//class end
  