import java.util.*;
public class 숫자야구게임 {
	static int[] userInput(int[] arr, int input) {
		
			arr[0]	= input/100;
			arr[1] = (input%100)/10;
			arr[2] = input%10;
			return arr;
	}
	static boolean duple(int[] user) {
		if (user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			return true;
		else return false;
	}
	static int[] score(int[] arr1, int[] arr2) {
		int s=0;int b=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(arr1[i]==arr2[j]) {
					if(i==j) s++;
					else b++;
				}
			}
		}
		int res[] = {s,b};
		return res;
		
	}
	static void result(int[] arr) {
		System.out.println("=========결과========");
		System.out.print("S: ");
		for(int i=0;i<arr[0];i++) {
			System.out.print("●");
		}
		System.out.println();
		System.out.print("B: ");
		for(int i=0;i<arr[1];i++) {
			System.out.print("○");
		}
		System.out.println();
	}
	
	
	
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
			userInput(user,input);
			
			if(duple(user)) {
				System.out.println("중복된 수는 사용할 수 없습니다");
				continue;
			}
			
			int[] score = score(com,user);
			
//			System.out.printf("Input Number:%d, Result:%dS-%dB\n",input,score[0],score[1]);
//			if(score[0]==3) {
//				System.out.println("Game clear");
//				break;
//			}
			
			/// 전광판
			result(score);
			if(score[0]==3) {
				System.out.println("Game clear");
				break;
			}
		}
	}
}
