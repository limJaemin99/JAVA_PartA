package partA.day09_week3;

import java.util.Arrays;
import java.util.Scanner;

//배열 기본
public class A34ArrayBasic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//변수 선언은 저장할 데이터의 형식과 이름을 정의	//변수 선언 1개당 1개의 메모리를 할당
		//배열 선언은 저장할 데이터의 형식, 이름과 데이터의 개수(할당받는 메모리 크기)
		
		int[] arr1 = {34, 56, 78, 89, 65};	//저장할 값 초기화 및 크기 결정(4byte x 5 = 20byte 할당), index는 0 ~ 4
		int[] arr2 = new int[10];			//초기값은 기본값 0, 정수 10개(40byte 할당), index는 0 ~ 9
		
		//배열의 주요 속성 : length는 배열의 길이(개수)를 갖는다.
		System.out.println("arr2 배열의 길이 = "+arr2.length);
		//배열에 저장된 값은 성적, 포인트, 이름 등등 같은 의미를 갖는 데이터가 저장되고, 처리해야할 동작도 같다.
		//>> 반복문 필수
		
		System.out.println("for-each문====================");
		for (int i : arr1) {
			System.out.println(i);
		}

		System.out.println("for문=========================");
		for (int i = 0; i < arr1.length; i++) {
//			System.out.print(String.format("arr1[%d] = %d\n",i,arr1[i]));
//			System.out.printf("arr1[%d] = %d\n",i,arr1[i]);
			System.out.println(arr1[i]);
		}
		
		System.out.println("=============================");
		
		System.out.println("Arrays 사용(배열 그대로 String출력)");
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("=============================");
		
		//배열활용 : arr1의 배열요소 중 70 이상인 값의 개수
		int count=0;
		for (int i : arr1) {
			if(i>=70) count++;
		}
		System.out.printf("arr1의 배열요소 중 70 이상인 값의 개수 : %d개\n",count);
		
		int sum=0;
		for (int i : arr1) {
			sum += i;
		}
		System.out.printf("arr1의 배열요소의 합 = %d\n",sum);
		
		sum=0;
		for (int i : arr1) {
			if(i>=70) {
			sum += i;
			count++;
			}
		}
		System.out.printf("arr1의 배열요소 중 70 이상인 값의 합 = %d\n",sum);
		
		//배열요소값을 저장하기
		System.out.println("\narr2배열에 값 입력하기");
		arr2[0] = 11;	//변수의 대입문 형식이고 단, index필요
		arr2[5] = 55;
		
		
		System.out.println("10개의 난수 생성하여 배열 저장하기");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (int)(Math.random()*45+1);
			System.out.print(arr2[i]+" ");
			if (i==4) System.out.println();	//1줄에 5개 출력
		}
//		배열을 배우기 전에 사용했던 코드
//		double d = Math.random()*45+1;
//		int rnd = (int)d;

		
		//Arrays 클래스에는 배열과 관련된 static메소드가 있다.
		System.out.println("Arrays 클래스 메소드 연습");
		System.out.println("배열요소의 값을 for문 없이 출력");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println("배열요소의 값을 순서대로 나열(정렬 : sort)");
//		System.out.println(Arrays.sort(arr1));	//void라 print출력 불가
//		System.out.println(Arrays.sort(arr2));	//void라 print출력 불가
		Arrays.sort(arr1);	//정렬한 결과 arr1 배열 index 값을 변경
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr2);	//정렬한 결과 arr1 배열 index 값을 변경
		System.out.println(Arrays.toString(arr2));
		
		
		
	}//main end
}//class end
