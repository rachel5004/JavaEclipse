/*
 *    ��� 
 *     => ������ Ŭ������ ��� ��ɰ� ��� �����͸� �޾Ƽ� Ȯ���ϴ� Ŭ������ ����� 
 *     => ����� ���� 
 *        =========
 *        class A
 *        class B extends A
 *             ===        == ����� ������ Ŭ����
 *             ����� �޴� Ŭ���� 
 *     => �ڹ� ����� ���� => ���� ���
 *        
 *     => ���� : �ִ� �״�� ��� : ����Ŭ���� 
 *               �����ؼ� ��� : ��� 
 *               
 *     => ���� 
 *        extends 
 *        
 *        class A
 *        class B extends A
 *        *** ����� �޴� ��� (�⺻�� ��ӳ����� Ŭ������ ����� �޾� �´�)
 *            �� ���� ���� (static����,static�޼ҵ�,�����ڴ� ����)
 *                       ====================== ��ӹ��� Ŭ������ ����� ����
 *            private�� ����� �������µ� ����� �Ұ����ϴ� (private => protected)
 *    => �ߺ��� �����Ҷ� 
 *    
 *    class A
 *    {
 *        int a=10;
 *        int b=20;
 *        public void display()
 *        {
 *        }
 *    }
 *    A => a,b,display()
 *    class B extends A
 *    {
 *       ==============================
 *        �������̵�
 *        int a=100;
 *        int b=200;
 *        public void display()
 *        {
 *        }
 *       ==============================
 *       
 *       public void bbb()
 *       {
 *       }
 *    }
 *    
 *    B ==> a,b,display() ,bbb()
 *    
 *    Ŭ������ ũ�⸦ �� => ����� ������ Ŭ������ ũ��  (���)
 *    ���� 
 *     |
 *    ��� (���,����)
 */
class SuperClass {
	int a=10;
	int b=20;
	
}
public class SubClass {
    //int a=10;
    //int b=20;
    //���� 
	SuperClass sc=new SuperClass();
	public static void main(String[] args) {
        SubClass s=new SubClass();
        System.out.println(s.sc.a);
        System.out.println(s.sc.b);
        
	}

}














