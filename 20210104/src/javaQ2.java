import java.util.*;
public class javaQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String course[]={"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
    	int score[]={95, 88, 76, 62, 55};
    	while(true) {
    		boolean b = false;
    		System.out.print("과목 이름>> ");
    		String crs = sc.next();
    		if (crs.equals("그만")) break;
    		for(int i=0;i<course.length;i++) {
    			if(crs.equals(course[i])) {
    				b = true;
    				System.out.println(crs+"의 점수는 "+score[i]);
    				break;
    			}
    		}
    		if(b == false)
    			System.out.println("없는 과목입니다.");
    	}
	}
}

	
