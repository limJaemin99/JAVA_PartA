package partA.day11;

import java.util.Arrays;


//실행시간을 확인하는 예시 :
//시간단위 : 시, 분, 초, ms㎳(1000분의 1초/10의 -3승/0.001초), us㎲(100만분의 1초/10의-6승/0.000001초), ns㎱(10억분의 1초/10의 -9승)
														//(u 아님.u같이 생긴 기호임)
public class lottoNumbersTeacher {
	public static void main(String[] args) {
		//실행시간이 조금 더 걸리게 하는 예제 (메소드 사용이 아닌 난수를 많이 입력하는 방식)
		//1~n 사이의 난수를 중복없이 만들어서 배열에 저장하려고 한다.
		//배열의 크기도 변수로 설정한다.
		//1~n 까지 중복없이 임의로 만들어서 저장시키기
		int n = 45;	
		
		
		int[] lottoNumbers = new int[6];
		int i = 0;
		boolean status = false;
		
		System.out.println("currentTimeMillis : 1970년 1월 1일 0시 기준으로 카운트한 시간입니다. (long)");
		System.out.println("현재 시간 : "+System.currentTimeMillis()+"ms");	//밀리세컨드 ms㎳
		System.out.println("nanoTime : JAVA 가상머신이 사용하는 시간으로 시스템의 시간과는 상관없다.");
		System.out.println("현재 시간 : "+System.nanoTime()+"us");	//나노세컨드 us㎲
		System.out.println("현재 시간 : "+System.nanoTime()/1000000.0+"ms");	//나노 ▶ 밀리 세컨드 변환
		//★★★코드의 실행시간을 측정할때는 nanoTime을 사용한다.★★★
		
		long start = System.nanoTime();
		
		
		while(i !=6) {
			int temp = (int)(Math.random()*n+1);
			
			int j=0;
			for (j = 0; j < lottoNumbers.length; j++) {
				status = lottoNumbers[j]==temp;
				if(status) {
					System.out.println("*배열에 있는 값 : "+temp);
					break;
				}
				
			}
			if(!status) {
				lottoNumbers[i]=temp;
				System.out.printf("lotto[%d] = %d\n",i,lottoNumbers[i]);
				i++;
			}
		}//while end
		System.out.println(Arrays.toString(lottoNumbers));
		
		System.out.println("실행시간 : "+start+"ns");
		
		
		
		
	}//main end
}//class end