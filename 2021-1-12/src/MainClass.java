// �Ű����� ���� 
// ���� �����ϴ� ��� (�⺻��������)
// �ּҸ� �����ϴ� ��� (�迭,Ŭ����=> �Ѱ��� �ּ��� �����͸� ����) : String�� ���� (String�� �⺻���������� ����)
/*
 *    �������� (�ڷ���)
 *      = �⺻�������� (�ڹٿ��� �����ϴ� ������Ÿ��)
 *      = ����� �������� (�迭,Ŭ����) : ���
 */

/*
 *   ========== ��ü ���� ���α׷� ==================
 *    Ŭ������ ����� ���� 
 *    ================
 *     1. ������ ���� (���,����)
 *     2. Ŭ������ ������ �ִ� �����͸� ��ȣ (ĸ��ȭ)
 *     3. ������ ���� , �߰��� ���� (������)
 *        ============================
 *          �������� 
 *          ====== �ŷڼ� 
 *    ============================================ 
 *    
 *    Ŭ������ ������� 
 *    ==============
 *      ���� (page 246)
 *      ============================================================
 *        = �ν��Ͻ����� : new�� �̿��Ҷ����� ���� �޸𸮰� ���� 
 *        = ��������,Ŭ�������� : static => �����Ͻÿ� �ڵ����� �޸� ����  
 *      =================================Ŭ���� ���ȿ��� ����
 *        = �������� : �޼ҵ� {} �ȿ��� ���� 
 *      �޼ҵ� : �Ѱ��� ����� �����ϴ� ��ɹ��� ����
 *      ������
 */

class music {
	String title, singer;

	void print() {
		System.out.println("�뷡��: " + title);
		System.out.println("������: " + singer);
	}
}

class data {
	int x = 10;
	int y = 20;
}

class datasend {

	void swap(int x, int y) {
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println(x + " " + y);
	}

	void swap(int[] arr) {
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		System.out.println(arr[0] + " " + arr[1]);
	}

	void swap(data d) {
		int tmp = d.x;
		d.x = d.y;
		d.y = tmp;
		System.out.println(d.x + " " + d.y);
	}

	void swap(String s1, String s2) {
		String temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println(s1 + " " + s2);
	}
}

public class MainClass {
	public static void main(String[] args) {
		music m1 = new music();
		m1.title = "aaa";
		m1.singer = "bbb";

		music m2 = new music();
		m2.print();

		music m3 = m1;
		m3.print();


		
		data d = new data();
		datasend ds = new datasend();

		String s1 = "Hello";
		String s2 = "Java";
		
		System.out.println("s1=" + s1 + ",s2=" + s2);
		ds.swap(s1, s2);
		System.out.println("������:s1=" + s1 + ",s2=" + s2);

		int x = 10, y = 20;
		System.out.println("x=" + x + ",y=" + y);

		ds.swap(x, y);
		System.out.println("������:x=" + x + ",y=" + y);

		int[] arr = { 10, 20 };
		System.out.println("arr[0]=" + arr[0] + ",arr[1]=" + arr[1]);
		ds.swap(arr);
		System.out.println("������:arr[0]=" + arr[0] + ",arr[1]=" + arr[1]);

		System.out.println("d.x=" + d.x + ",d.y=" + d.y);
		ds.swap(d);
		System.out.println("������:d.x=" + d.x + ",d.y=" + d.y);

	}

}
