package partA.day09_week3;

import java.util.Arrays;
import java.util.Scanner;

//String배열
//1) String배열이 저장하는 값은 String 객체에 대한 참조값이다.
//2) String배열은 초기 문자열이 없고 크기만으로 선언했을때 참조 상태는 null입니다.
public class A35StringArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//데이터를 여러개 저장하는 변수면 복수형 단어 쓰는걸 추천
		String[] keywords = {"continue","break","switch","for","while","static","void"};		
		
		//출력
		System.out.println("=====for-each문=====");
		for (String i : keywords) {
			System.out.println(i);
		}
		System.out.println("=====for문=====");
		for (int i = 0; i < keywords.length; i++) {
//			System.out.println(String.format("keywords[%d] = %s",i,keywords[i]));
//			System.out.printf("keywords[%d] = %s\n",i,keywords[i]);
			System.out.println(keywords[i]);
		}
		
		System.out.println("=====Arrays.toString=====");
		System.out.println(Arrays.toString(keywords));
		
		System.out.println("=====Arrays.sort=====");
		Arrays.sort(keywords);	//String타입 배열도 정렬 가능
		System.out.println(Arrays.toString(keywords));
		
		//데이터 저장
		System.out.println("초기값에 값 집어넣기");
		String[] names = new String[10];
		int i;	//메소드 지역변수
				//for문 밖에서도 i 사용하기 위해 선언을 밖에서 함
		
		System.out.println(Arrays.toString(names));	//★★★★★String타입의 초기값은 null★★★★★
		for (i = 0; i < names.length; i++) {
			System.out.printf("%d번째 이름을 입력하세요.(종료:end)\n☞",(i+1));
			names[i] = sc.next();	
			//end 입력하면 for 중단
			if(names[i].equals("end")==true) break;	//String 타입 true/false (.equals) 사용
		
			//사용자 입력을 받아 문자열 객체를 생성하고 names배열이 문자열 객체를 참조
			System.out.printf("i=%d, names[%d] = %s (길이 : %d)\n\n",i,i,names[i],names[i].length());
		}
		System.out.println("i = "+(i+1)+" 에서 for문이 종료되었습니다.");
		System.out.println(Arrays.toString(names));
		
		
		//null인 상태에서 출력시 오류 발생
//		for (int i = 0; i < names.length; i++) {
//			System.out.printf("i=%d, names[%d] = %s(길이 : %d)\n",i,i,names[i],names[i].length());
//		}
		
  		
		
		
		
		
		
		
		
		
		
	}//main end
}//class end
