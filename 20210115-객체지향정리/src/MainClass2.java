// �޼ҵ� => �Ѱ� Ŭ�����ȿ��� ���� �̸��� �޼ҵ带 ��� �� �� �ִ� 
// => �ߺ��޼ҵ� ���� => �������� ����� ����� (�����ε�)
/*
 *    ���� 
 *     �Ű������� �������� , ������ �ٸ��� 
 *     �������� ������� 
 *     �޼ҵ���� ���� 
 */

import java.util.*;
public class MainClass2 {
	public void plus(int a, int b) {
		System.out.println("����");
		System.out.println(a+b);
	}
	public double plus(double d1, double d2) {
		System.out.println("�Ǽ�");
		return (d1+d2);
	}
	public int plus(char c1,char c2) {
		System.out.println("����");
		return (c1+c2);
	}
	public String plus(String s1,String s2) {
		System.out.println("���ڿ�");
		return (s1+s2);
	}
	
	public static void main(String[] args) {
		MainClass2 m = new MainClass2();
		m.plus(10,20);
		m.plus('A', 66);
		m.plus(10.5f, 'A');
		
	}

}
