import java.util.Scanner;

public class moviemain {
	public static void main(String[] args) {
		moviesystem ms = new moviesystem(); // movieAllData() 저장
		movie[] m = ms.moviealldata();

		int i = 1;
		for (movie movie : m) {
			System.out.println(i + "." + movie.title);
			// System.out.println("가수명:"+movie.singer);
			// System.out.println("앨범:"+movie.album);
			// System.out.println("===================================================");
			i++;
		}

		for (movie movie : m) {
			System.out.println("노래명: " + movie.title);
			System.out.println("가수명: " + movie.singer);
			System.out.println("앨범명: " + movie.album);
			System.out.println("=========================");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("검색어: ");
		String ss = sc.next();
		movie[] mm = ms.moviefinddata(ss);
		for (movie movie : mm) {
			System.out.println("노래명: " + movie.title);
			System.out.println("가수명: " + movie.singer);
			System.out.println("앨범명: " + movie.album);
			System.out.println("=========================");
		}

		System.out.print("번호를 입력:");
		int no = sc.nextInt();
		movie mm = ms.moviedetaildata(no);
		System.out.println("노래명:" + mm.title);
		System.out.println("가수명:" + mm.singer);
		System.out.println("앨범:" + mm.album);
		System.out.println("상태:" + mm.state + "(" + mm.modify + ")");
		
		
		System.out.print("가수명 입력:");
		String singer=sc.next();
		String[] s = ms.singerfinddata(singer);
		for(String sss:s){
			  System.out.println(sss);
			  System.out.println("===========================================");
		  }
		
		
	}
	
}
