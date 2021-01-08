import java.util.*;
public class 메소드활용2 {
	static int menu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("=========메뉴========");
		System.out.println("1. 뮤직 Top50 전체 보기");
		System.out.println("2. 노래 검색");
		System.out.println("3. 가수명 검색");
		System.out.println("4. 상세 보기");
		System.out.println("5. 나가기");
		System.out.println("====================");
		int m = 0;
		while(true) {
			System.out.print("메뉴를 선택하세요: ");
			m = sc.nextInt();
			if (m>5 || m<1) {
				System.out.println("없는 메뉴");
				continue;
			}break;
		}
		return m;
	}

	static void musicData() {
		String[] title = 메소드활용_1.title;
		String[] singer = 메소드활용_1.singer;
		String[] album = 메소드활용_1.album;

		System.out.println("=====뮤직 랭크 50=====");
		for(int i=0;i<50;i++) {
			System.out.println("제목: "+title[i]);
			System.out.println("가수: "+singer[i]);
			System.out.println("앨범: "+album[i]);
			System.out.println("===============");
		}
	}
	static void searchTitle() {
		String[] title = 메소드활용_1.title;
		Scanner sc = new Scanner(System.in);
		System.out.print("노래 검색: ");
		String key = sc.next();
		System.out.println("======검색 결과======");
		for (int i=0;i<50;i++) {
			if(title[i].contains(key)) {
				System.out.println(title[i]);
			}
		}
	}
	static void searchSinger() {
		String[] title = 메소드활용_1.title;
		String[] singer = 메소드활용_1.singer;
		Scanner sc = new Scanner(System.in);
		System.out.print("가수 검색: ");
		String key = sc.next();
		System.out.println("======검색 결과======");
		for (int i=0;i<50;i++) {
			if(singer[i].contains(key)) {
				System.out.println(title[i]);
			}
		}
	}
	static void detailData() {
		Scanner sc = new Scanner(System.in);
		String[] title = 메소드활용_1.title;

		System.out.println("======노래 목록======");
		for (int i=0;i<50;i++) {
			System.out.println((i+1)+"."+title[i]);
		}
		System.out.print("선택: ");
		int key = sc.nextInt();
		String mtitle = 메소드활용_1.title[key-1];
		String singer = 메소드활용_1.singer[key-1];
		String album = 메소드활용_1.album[key-1];
		String state = 메소드활용_1.state[key-1];
		int modify = 메소드활용_1.modify[key-1];
		
		System.out.println("제목: "+mtitle);
		System.out.println("가수: "+singer);
		System.out.println("앨범: "+album);
		if(state.equals("상승"))
			System.out.println("변동: ▲ "+modify);
		else if(state.equals("유지"))
			System.out.println("변동: - "+modify);
		else System.out.println("하락: - "+modify);
	}
			
	public static void main(String[] args) {
		while (true) {
			int m = menu();
			switch(m) {
			case 1:
				musicData();
				break;
			case 2:
				searchTitle();
				break;
			case 3:
				searchSinger();
				break;
			case 4:
				detailData();
				break;
			case 5:
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}

	}

}
