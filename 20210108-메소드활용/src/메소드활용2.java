import java.util.*;
public class �޼ҵ�Ȱ��2 {
	static int menu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("=========�޴�========");
		System.out.println("1. ���� Top50 ��ü ����");
		System.out.println("2. �뷡 �˻�");
		System.out.println("3. ������ �˻�");
		System.out.println("4. �� ����");
		System.out.println("5. ������");
		System.out.println("====================");
		int m = 0;
		while(true) {
			System.out.print("�޴��� �����ϼ���: ");
			m = sc.nextInt();
			if (m>5 || m<1) {
				System.out.println("���� �޴�");
				continue;
			}break;
		}
		return m;
	}

	static void musicData() {
		String[] title = �޼ҵ�Ȱ��_1.title;
		String[] singer = �޼ҵ�Ȱ��_1.singer;
		String[] album = �޼ҵ�Ȱ��_1.album;

		System.out.println("=====���� ��ũ 50=====");
		for(int i=0;i<50;i++) {
			System.out.println("����: "+title[i]);
			System.out.println("����: "+singer[i]);
			System.out.println("�ٹ�: "+album[i]);
			System.out.println("===============");
		}
	}
	static void searchTitle() {
		String[] title = �޼ҵ�Ȱ��_1.title;
		Scanner sc = new Scanner(System.in);
		System.out.print("�뷡 �˻�: ");
		String key = sc.next();
		System.out.println("======�˻� ���======");
		for (int i=0;i<50;i++) {
			if(title[i].contains(key)) {
				System.out.println(title[i]);
			}
		}
	}
	static void searchSinger() {
		String[] title = �޼ҵ�Ȱ��_1.title;
		String[] singer = �޼ҵ�Ȱ��_1.singer;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �˻�: ");
		String key = sc.next();
		System.out.println("======�˻� ���======");
		for (int i=0;i<50;i++) {
			if(singer[i].contains(key)) {
				System.out.println(title[i]);
			}
		}
	}
	static void detailData() {
		Scanner sc = new Scanner(System.in);
		String[] title = �޼ҵ�Ȱ��_1.title;

		System.out.println("======�뷡 ���======");
		for (int i=0;i<50;i++) {
			System.out.println((i+1)+"."+title[i]);
		}
		System.out.print("����: ");
		int key = sc.nextInt();
		String mtitle = �޼ҵ�Ȱ��_1.title[key-1];
		String singer = �޼ҵ�Ȱ��_1.singer[key-1];
		String album = �޼ҵ�Ȱ��_1.album[key-1];
		String state = �޼ҵ�Ȱ��_1.state[key-1];
		int modify = �޼ҵ�Ȱ��_1.modify[key-1];
		
		System.out.println("����: "+mtitle);
		System.out.println("����: "+singer);
		System.out.println("�ٹ�: "+album);
		if(state.equals("���"))
			System.out.println("����: �� "+modify);
		else if(state.equals("����"))
			System.out.println("����: - "+modify);
		else System.out.println("�϶�: - "+modify);
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
				System.out.println("���α׷� ����");
				System.exit(0);
			}
		}

	}

}
