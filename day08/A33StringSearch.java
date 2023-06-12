package partA.day08;

public class A33StringSearch {
	public static void main(String[] args) {
		
		// 노래 가사 중 특정 단어 찾기
		
		String lyrics = "다른 문을 열어 따라 갈 필요는 없어\r\n"
				+ "넌 너의 길로 난 나의 길로 음\r\n"
				+ "하루하루마다 색이 달라진 느낌\r\n"
				+ "밝게 빛이 나는 길을 찾아\r\n"
				+ "I’m on my way 넌 그냥 믿으면 돼\r\n"
				+ "I’m on my way 보이는 그대로야\r\n"
				+ "너는 누군가의 Dreams come true\r\n"
				+ "제일 좋은 어느 날의 데자뷰\r\n"
				+ "머물고픈 어딘가의 낯선 뷰\r\n"
				+ "I’ll be far away\r\n"
				+ "That’s my\r\n"
				+ "Life is 아름다운 갤럭시\r\n"
				+ "Be a writer, 장르로는 판타지\r\n"
				+ "내일 내게 열리는 건 big big 스테이지\r\n"
				+ "So that is who I am\r\n"
				+ "Look at me\r\n"
				+ "Look at me\r\n"
				+ "Look at me\r\n"
				+ "now";
		String find = "way";
		int count = 0;
		int index, fromIndex = 0;
		boolean status = true;
		
		while(status) {
			index = lyrics.indexOf(find,fromIndex);
			System.out.println("테스트 출력 : "+index);
			if(index !=-1) {
				count++;
				fromIndex = index + find.length();
			} else {
				status = false;
			}
		}
		System.out.println(count);
		
	}
}
