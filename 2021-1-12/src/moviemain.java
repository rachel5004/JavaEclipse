import java.util.Scanner;

public class moviemain {
	public static void main(String[] args) {
		moviesystem ms = new moviesystem();
		movie[] m=ms.moviealldata();
		for(movie movie:m) {
			System.out.println("�뷡��: "+movie.title);
			System.out.println("������: "+movie.singer);
			System.out.println("�ٹ���: "+movie.album);
			System.out.println("=========================");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻���: ");
		String ss = sc.next();
		movie[] mm = ms.moviefinddata(ss);
		for(movie movie:mm) {
			System.out.println("�뷡��: "+movie.title);
			System.out.println("������: "+movie.singer);
			System.out.println("�ٹ���: "+movie.album);
			System.out.println("=========================");
		}
	}

}
