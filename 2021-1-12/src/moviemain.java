import java.util.Scanner;

public class moviemain {
	public static void main(String[] args) {
		moviesystem ms = new moviesystem();
		movie[] m=ms.moviealldata();
		for(movie movie:m) {
			System.out.println("노래명: "+movie.title);
			System.out.println("가수명: "+movie.singer);
			System.out.println("앨범명: "+movie.album);
			System.out.println("=========================");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("검색어: ");
		String ss = sc.next();
		movie[] mm = ms.moviefinddata(ss);
		for(movie movie:mm) {
			System.out.println("노래명: "+movie.title);
			System.out.println("가수명: "+movie.singer);
			System.out.println("앨범명: "+movie.album);
			System.out.println("=========================");
		}
	}

}
