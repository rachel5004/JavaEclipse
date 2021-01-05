import java.util.*;
public class 배열생성 {
	public static void main(String[] args) {
//		try{
//		    String[] cmdArray = {"notepad.exe", "test.txt"};    //실행할 프로그램과 전달할 인수를 문자열 배열로 만든다.
//		    Runtime.getRuntime().exec(cmdArray);
//		}catch(Exception e){
//		    System.out.println(e);
//		}
		Scanner sc = new Scanner(System.in);
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		char[] score = new char[3];
		int[] rank = new int[3];
		for (int i = 0; i<3;i++) {
			System.out.println((i+1)+"번째 국어점수:");
			kor[i] = sc.nextInt();
			System.out.println((i+1)+"번째 영어점수:");
			eng[i] = sc.nextInt();
			System.out.println((i+1)+"번째 수학점수:");
			math[i] = sc.nextInt();
			}
		for(int i = 0;i<3;i++) {
			total[i] = kor[i]+eng[i]+math[i];
		}
		for(int i = 0;i<3;i++) {
			switch((int)(avg[i]/10)){
				case 10:
				case 9:
					score[i]='A';
					break;
				case 8:
					score[i]='B';
					break;
				case 7:
					score[i]='C';
					break;
				case 6:
					score[i]='D';
					break;
				default:
					score[i]='F';
			}
		}
		for(int i = 0;i<3;i++) {
			rank[i] = 1;
			for(int j = 0;j<3;j++) {
				if (total[i]<total[j])
					rank++;
			}
		}
	}
}
