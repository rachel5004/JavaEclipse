import java.util.*;
public class 배열활용3 {
//빈도수 구하기(word cloud)
	public static void main(String[] args) {
		int[] arr = new int[100];
		int[] cnt = new int[10];
		for (int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10);
		}
		//빈도수 확인
		for(int i:arr) {
			cnt[i]++;
		}
		for(int i:arr) {
			System.out.print(i);
		}
		System.out.println("\n======최종======");
		for(int i=0;i<cnt.length;i++) {
			System.out.println(i+":"+cnt[i]);
		}
		System.out.println("=====추천=====");
		int max = 0;
		for(int i=0;i<cnt.length;i++) {
			if(max<cnt[i]) max = cnt[i];
		}
		for(int i=0;i<cnt.length;i++) {
			if(max==cnt[i])
				System.out.println(max);
		}
	}

}
