import java.util.Scanner;

public class moviemain {
	public static void main(String[] args) {
		moviesystem ms = new moviesystem(); // movieAllData() ����
		movie[] m = ms.moviealldata();

		int i = 1;
		for (movie movie : m) {
			System.out.println(i + "." + movie.title);
			// System.out.println("������:"+movie.singer);
			// System.out.println("�ٹ�:"+movie.album);
			// System.out.println("===================================================");
			i++;
		}

		for (movie movie : m) {
			System.out.println("�뷡��: " + movie.title);
			System.out.println("������: " + movie.singer);
			System.out.println("�ٹ���: " + movie.album);
			System.out.println("=========================");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("�˻���: ");
		String ss = sc.next();
		movie[] mm = ms.moviefinddata(ss);
		for (movie movie : mm) {
			System.out.println("�뷡��: " + movie.title);
			System.out.println("������: " + movie.singer);
			System.out.println("�ٹ���: " + movie.album);
			System.out.println("=========================");
		}

		System.out.print("��ȣ�� �Է�:");
		int no = sc.nextInt();
		movie mm = ms.moviedetaildata(no);
		System.out.println("�뷡��:" + mm.title);
		System.out.println("������:" + mm.singer);
		System.out.println("�ٹ�:" + mm.album);
		System.out.println("����:" + mm.state + "(" + mm.modify + ")");
		
		
		System.out.print("������ �Է�:");
		String singer=sc.next();
		String[] s = ms.singerfinddata(singer);
		for(String sss:s){
			  System.out.println(sss);
			  System.out.println("===========================================");
		  }
		
		
	}
	
}
