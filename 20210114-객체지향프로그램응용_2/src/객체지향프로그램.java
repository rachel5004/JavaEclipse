/*
 *    1. static => instance�޼ҵ�(����) ȣ�� 
 *       => �ٸ� Ŭ�������� �ҷ��� ��� 
 *    2. instance�޼ҵ� => static 
 *       => �ٸ� Ŭ�������� �ҷ��� ��� 
 *       
 *    class A
 *    {
 *        int a;
 *        static int b;
 *        
 *        public void disp1()
 *        {
 *           ��� ó��
 *        }
 *        public static void disp2()
 *        {
 *           ��� ó��
 *        }
 *        
 *        // main
 *        public static void main(String[] args)
 *        {
 *           //1 . static �޼ҵ� ȣ�� , static ���� ȣ�� 
 *           System.out.println(b); => ���� Ŭ�����ȿ� �ִ� ��� 
 *           disp2();
 *        }
 *    }
 */
class A {
	static int b=100;
	int c=200;
	public void disp() {
		System.out.println("A:disp() Call...");
	}
	public static void display() {
		System.out.println("A:display() Call");
	}
}
public class ��ü�������α׷� {
    static int a=10;
    public static void disp() {
    	System.out.println("disp:Call...");
    }
	public static void main(String[] args) {
        System.out.println("a="+a);
        ��ü�������α׷�.disp();
        A.display();
        System.out.println("b="+A.b);
        A a=new A();
        a.disp();
        System.out.println("a.c="+a.c);
	}

}








