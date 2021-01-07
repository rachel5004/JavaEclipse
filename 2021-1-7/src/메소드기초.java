import java.io.*;
import java.util.*;

public class 메소드기초 {
	static void gugudan(int dan) {
		for(int i=0;i<=9;i++) {
			System.out.printf("%d*%d = %d\n",dan,i,dan*i);
		}
	}
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
	        String[] new_a = br.readLine().split(" ");
			int[] num = new int[new_a.length];
			for(int j=0;j<new_a.length;j++) {
				num[j] = Integer.parseInt(new_a[j]);
			}
			
			int sum = 0;
			for(int j=1;j<num.length;j++) {
				sum+=num[j];
			}
			double avg = sum/(double)num[0];
			int cnt = 0;
			for(int j=1;j<num.length;j++) {
				if(num[j]>avg) {
					cnt++;
				}
			}
			double res = (cnt/(double)num[0])*100;
			System.out.print(String.format("%.3f", res));
			System.out.println("%");
		}
//		System.out.print("단 입력: ");
//		int dan = sc.nextInt();
//		gugudan(dan);
//		System.out.println("End");
	}
}
	
