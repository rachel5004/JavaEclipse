import java.util.*;
public class �޷¸���� {
	
	static void weeks() {
		String[] strweek = {"��","��","ȭ","��","��","��","��"};
		for(String week:strweek)
			System.out.print(week+"\t");
		System.out.println();
	}
	static boolean LeanYear(int year) {
		if((year%4==0 && year%100!=0)||(year%400==0))
			return true;
		else return false;
	}
	static int getTotal(int month,int total, int[] lastDay) {
		for(int i=0;i<month-1;i++) {
			total+=lastDay[i];
		}
		total++;
		return total;
	}
	static void getWeek(int[] lastDay, int month, int week) {
		for(int i=1;i<=lastDay[month-1];i++) {
			if(i==1) {
				for(int j=0;j<week;j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				week =  0;
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		int year =  sc.nextInt();
		System.out.print("�� �Է�:");
		int month =  sc.nextInt();
		System.out.println(year+"�� "+month+"��");
		System.out.println("\n");
		
		weeks();
		
//		int week = 1;
//		for(int i=1;i<=31;i++) {
//			System.out.print(i+"\t");
//			if(i%7==0) {
//				System.out.println();
//				week++;
//		}
		
		int total = (year-1)*365+(year-1)/4
								-(year-1)/100
								+(year-1)/400;
		int[] lastDay = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(LeanYear(year))
			lastDay[1]=29;
		else lastDay[1]=28;
//		
//		for(int i=0;i<month-1;i++) {
//			total+=lastDay[i];
//		}
//		total++;
		total = getTotal(month, total, lastDay);
		int week = total%7;
		
		getWeek(lastDay,month,week);
	}

}
