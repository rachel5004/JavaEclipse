import java.util.*;
public class ���ھ߱����� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] com = {3,6,9};
		int[] user = new int[3];
		
		while(true) {
			System.out.print("���ڸ� ���� �Է�:");
			int input = sc.nextInt();
			if(input<100||input>999) {
				System.out.println("�߸��� �Է��Դϴ�");
				continue;
			}
			user[0]	= input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2]) {
				System.out.println("�ߺ��� ���� ����� �� �����ϴ�");
				continue;
			}
			
			int s=0;int b=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(com[i]==user[j]) {
						if(i==j) s++;
						else b++;
					}
				}
			}
			//System.out.printf("Input Number:%d, Result:%dS-%dB\n",input,s,b);
			
			/// ������
			System.out.println("=========���========");
			System.out.print("S: ");
			for(int i=0;i<s;i++) {
				System.out.print("��");
			}
			System.out.println();
			System.out.print("B: ");
			for(int i=0;i<b;i++) {
				System.out.print("��");
			}
			System.out.println();
			if(s==3) {
				System.out.println("Game clear");
				break;
			}
		}
	}
}
