import java.util.*;
public class �迭Ȱ��3 {
//�󵵼� ���ϱ�(word cloud)
	public static void main(String[] args) {
		int[] arr = new int[100];
		int[] cnt = new int[10];
		for (int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10);
		}
		//�󵵼� Ȯ��
		for(int i:arr) {
			cnt[i]++;
		}
		for(int i:arr) {
			System.out.print(i);
		}
		System.out.println("\n======����======");
		for(int i=0;i<cnt.length;i++) {
			System.out.println(i+":"+cnt[i]);
		}
		System.out.println("=====��õ=====");
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
