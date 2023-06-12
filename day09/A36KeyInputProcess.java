package partA.day09_week3;

import java.util.Scanner;

//nextLine()과 nextInt() 2개 메소드를 같이 사용할때 문제점
public class A36KeyInputProcess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("문자열 입력 후 정수 입력하는 예제");
		//키보드 입력한 문자가 저장되는 메모리 영역에는
		//예시 : 김OO[Enter] 22[Enter]
		
		//↓입력 : 김OO[Enter]
		System.out.print("이름을 입력하세요.\n☞");
		name = sc.nextLine();	//nextLine은 [Enter]까지 가져온다.
		
		//↓입력 : 22[Enter]
		System.out.print("나이를 입력하세요.\n☞");
		age = sc.nextInt();		//nextInt는 [Enter]이전까지 가져온다. 
		
		System.out.println("이름 : "+name+", 나이 : "+age);
		
		
		
		
		System.out.println("정수 입력 후 문자열 입력하는 예제");
		//키보드 입력한 문자가 저장되는 메모리 영역에는
		
		//↓입력 : 22[Enter]
		System.out.print("나이를 입력하세요.\n☞");
		age = sc.nextInt();
		//↓입력 : [Enter]김OO
		System.out.print("이름을 입력하세요.\n☞");
		name = sc.nextLine();
		
		System.out.println("이름 : "+name+", 나이 : "+age);
		
		//nextLine() 씹히는 현상 해결방안
		System.out.println("1) 의미없는 nextLine() 하나를 더 쓴다. (잘 사용하지 않는 방법)");
		System.out.println("나이를 입력하세요.\n☞");
		age = sc.nextInt();
		System.out.print("이름을 입력하세요.\n☞");
		sc.nextLine();
		name = sc.nextLine();
		
		System.out.println("이름 : "+name+", 나이 : "+age);
		
		System.out.println("2) 37KeyInputParseInt 참고");
		
		
		
		
	}//main end
}//class end
