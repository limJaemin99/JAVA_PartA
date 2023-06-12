package partA.day03;

// 변수는 char start 1개만 선언하세요.
// 증가 연산자와 출력문을 여러번 사용해서 A~Z 출력하세요.

public class A08AlphabetPrint {
	public static void main(String[] args) {
		
		char start = 'A';
		
		System.out.println("A에서 Z로 출력하려면 1씩 덧셈을 한다.");
		System.out.print(start);
		start++;
		System.out.print(start);
		start++;        
		System.out.print(start);
		start++;        
		System.out.print(start);
		start++;        
		System.out.print(start);
		start++;        
		System.out.print(start);
		start++;        
		System.out.print(start);
		start++;        
		System.out.print(start);
		start++;        
		System.out.print(start);
		start++;        
		System.out.print(start);
		start++;        
		System.out.print(start);
		start++;        
		System.out.print(start);
		start++;        
		System.out.print(start);
		start++;        
		System.out.print(start);
		start++;
		System.out.print(start);
		start++;
		System.out.print(start);
		start++;
		System.out.print(start);
		start++;
		System.out.print(start);
		start++;
		System.out.print(start);
		start++;
		System.out.print(start);
		start++;
		System.out.print(start);
		start++;
		System.out.print(start);
		start++;
		System.out.print(start);
		start++;
		System.out.print(start);
		start++;
		System.out.print(start);
		start++;
		System.out.print(start);
		
		System.out.println();
		
		System.out.println("Z에서 A로 출력하려면 1씩 뺄셈을 한다.");
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		System.out.print(start);
		start--;
		
		System.out.println();
		System.out.println();
		
		System.out.println("for문 사용");
		System.out.println("A >> Z");
		
		char start2 = 'A';
		char finish2 = 'Z';
		int count = finish2 - start2 + 1;

		for (int i = 0; i < 26; i++) {
			System.out.print((char)(start2+i));
		}
		
		System.out.println();
		
		for (int i = 0; i < count; i++) {
			System.out.print((char)(finish2-i));
		}
		
		
		
	}//main
}//class
