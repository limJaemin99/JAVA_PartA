package partA.day10;

import java.util.Arrays;

// String ▶ char : toCharArray()
// char ▶ String : String.valueOf(char배열)

public class A39CharArrayTest {
	public static void main(String[] args) {
		
		//char 배열 테스트
		int[] nums = {1,2,3,4,5};
		char[] chs = {'하','이','~','자','바','ㅋ','ㅋ'};
		
		
		System.out.println("정수형 배열의 이름으로 print");
		System.out.println(nums);	//[I@515f550a
		System.out.println("문자형 배열의 이름으로 print");
		System.out.println(chs);	//하이~자바ㅋㅋ
		//char 배열은 문자열과 유사하게 다룰 수 있다.
		//char 배열 요소값을 나열하면 문자열이 된다.
		
		//[I@515f550a 에서 515f550a 은 해시코드값이고 해시 함수를 통해서 만들어지는 4byte 값
		//자바의 객체들을 식별하기 위해 객체가 갖는 여러가지 값들을 해시함수가 복합적으로 계산해서 만들어줌
		
		
		
		//문자열과 char배열 사이의 변환 메소드
System.out.println("1. 문자열을 char배열로 변환");
		String temp = "hello~java!";
		char[] tempArr = temp.toCharArray();
		for (int i = 0; i<tempArr.length; i++) {
			System.out.printf("tempArr[%d] = %c\n",i,tempArr[i]);
		}
		System.out.println(Arrays.toString(tempArr));
		
System.out.println();
		
System.out.println("2. char배열을 문자열로 변환");
		tempArr[5] = '*';
		temp = String.valueOf(tempArr);	//char ▶ String
		System.out.println(temp);		
		System.out.println(temp+" 문자열 길이 : "+temp.length());
		System.out.print(tempArr);//tempArr을 출력을 위해 자동으로 String 변환
		System.out.println(" 배열 길이 : "+tempArr.length);
		System.out.println(tempArr+" 배열 길이 : "+tempArr.length);//[C@7a79be86
		//문자열과 char배열의 + 연산을 실행하면 char배열의 String 자동변환하지 않음
		
		//[C@7a79be86 에서 7a79be86 은 해시코드값이고 해시함수를 통해서 만들어지는 4byte 값
		//자바의 객체들을 식별하기 위해 객체가 갖는 여러가지 값들을 해시함수가 복합적으로 계산해서 만들어줌
		//만약 해시코드값이 같다면 같은 객체로 인식한다. (객체의 주민등록번호라고 생각하면 됨)
		
		
		
		
		
		
		
	}//main end
}//class end
