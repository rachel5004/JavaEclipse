
/* Calender
 * 1�⵵ 1�� 1��~�۳�(2020-12-31)
 * +2021.1.1 ~ ���ޱ��� �� ����
 *+�Էµ� ��¥
 *%7 = ����
 */
import java.util.*;
public class Calender {

	public static void main(String[] args) {
		String[] strweek = {"��","��","ȭ","��","��","��","��"};
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵ �Է�:");
		int year = sc.nextInt();
		System.out.println("�� �Է�:");
		int month = sc.nextInt();
		System.out.println("�� �Է�:");
		int day = sc.nextInt();
		//���� ���ϱ�
		int total = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		int[] lastDay = {31,28,31,30,31,30,31,31,30,31,30,31};
		//���� ����
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastDay[1]=29;
		else lastDay[1]=28;
		//���ޱ����� ��
		for(int i=0;i<month-1;i++) {
			total+=lastDay[i];
		}
		//��¥ �Է�
		total+=day;
		int week = total%7;
		// ���
		System.out.printf("%d�� %d�� %d���� %s�����Դϴ�",year,month,day,strweek[week]);
	}

}
