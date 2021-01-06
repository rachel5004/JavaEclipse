
/* Calender
 * 1년도 1월 1일~작년(2020-12-31)
 * +2021.1.1 ~ 전달까지 총 날수
 *+입력된 날짜
 *%7 = 요일
 */
import java.util.*;
public class Calender {

	public static void main(String[] args) {
		String[] strweek = {"일","월","화","수","목","금","토"};
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력:");
		int year = sc.nextInt();
		System.out.println("월 입력:");
		int month = sc.nextInt();
		System.out.println("일 입력:");
		int day = sc.nextInt();
		//요일 구하기
		int total = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		int[] lastDay = {31,28,31,30,31,30,31,31,30,31,30,31};
		//윤년 조건
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastDay[1]=29;
		else lastDay[1]=28;
		//전달까지의 합
		for(int i=0;i<month-1;i++) {
			total+=lastDay[i];
		}
		//날짜 입력
		total+=day;
		int week = total%7;
		// 출력
		System.out.printf("%d년 %d월 %d일은 %s요일입니다",year,month,day,strweek[week]);
	}

}
