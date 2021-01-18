/*
 *   �����Ϸ��� �ڵ����� ÷��
 *   1. import java.lang.*;
 *             ========== String , System , Math... 
 *   2. �޼ҵ� => void => return�� ÷�� 
 *   3. ��� Ŭ������ �����ڸ� ������ �ִ� 
 *      ���� ��쿡 ����Ʈ �����ڸ� ÷�� 
 *   4. ��� Ŭ���� ���� (�ڹ��� ��� Ŭ������ Object����� �޴´�)
 *      class A extends Object
 *              ==============
 *   5. ��� Ŭ������ ����ó���� ������ �ִ� : ������ �� �ִ� �κ� ... 
 *   �ڹ�
 *   ����Ŭ 
 *   HTML / CSS => ������(bootstrap) => JavaScript (JQuery,Ajax)
 *   JSP
 *   SPRING  => XML,Anntation => MyBatis
 *   ���̽� 
 */
// Super => a,display(),Object
class Super{
	private int a=10;
	protected int b=20;
	public static int c = 30;   //��� X ������
	public void display() {
		System.out.println("Super: display() call...");
	}
	public void display1() {
		System.out.println("Super:display() Call...");
		
	}
	public void display2() {
		System.out.println("Super:display() Call...");
		
	}
	public Super() {   //�����ڴ� ��� X
		System.out.println("Super: ������ �Լ�()...");
	}
}
class Sub extends Super{
	private int c=10;
	public Sub() {
//		this.display();           //���=public,Ȳ��=protected,����=private
		System.out.println("Sub: ������() call...");
	}
	
	// �������̵� : ����Ŀ� ���� 
		/*
		 *   �������̵�(������) : �޼ҵ��� ���� ����  ==> ������ ���� : ���,�޼ҵ��,������,�Ű�����
		 *    1) ����� �޴´� 
		 *    2) �޼ҵ���� ���� 
		 *    3) �Ű������� ���� 
		 *    4) �������� ���� 
		 *    5) Ȯ���� ���� , ��Ҵ� �Ұ����ϴ�(����������) 
		 *       private < default < protected < public
		 *                 ======= 
		 *                           =========   
		 *     
		 */
	public void display() {
		// overriding
		System.out.println("Sub: display() call...");
	}
	public void display2() {
		System.out.println("Sub:display2() Call...");
		
	}
}
public class MainClass {
	public static void main(String[] args) {
		Super sp = new Super();
		Sub s = new Sub();
		s.display();
		System.out.println("s.b="+s.b);
		s.b=100;
		System.out.println("s.b="+s.b);

        s.display1();
        s.display2();
        sp.display();
	}
}
