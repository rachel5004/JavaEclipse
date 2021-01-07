import java.util.*;
public class 숫자야구게임 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] com = {3,6,9};
		int[] user = new int[3];
		
		while(true) {
			System.out.print("세자리 정수 입력:");
			int input = sc.nextInt();
			if(input<100||input>999) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			user[0]	= input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2]) {
				System.out.println("중복된 수는 사용할 수 없습니다");
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
			
			/// 전광판
			System.out.println("=========결과========");
			System.out.print("S: ");
			for(int i=0;i<s;i++) {
				System.out.print("●");
			}
			System.out.println();
			System.out.print("B: ");
			for(int i=0;i<b;i++) {
				System.out.print("○");
			}
			System.out.println();
			if(s==3) {
				System.out.println("Game clear");
				break;
			}
		}
	}
}
