import java.util.*;

public class 배열복사 {

	public static void main(String[] args) {
//		int[] arr = {10,20,30,40,50};
//		int[] tmp = new int[10];
//		for (int i:tmp) {
//			System.out.print(i+" ");		
//		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double avg = 0;
		for (int i = 0;i<n;i++) {
			String[] arr = sc.next().split(" ");
			for(String j:arr) {
				int num = Integer.parseInt(j); 
				avg+=num;
			}
		}
		System.out.println(avg/n);
	}
}
