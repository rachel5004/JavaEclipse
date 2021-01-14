class Super{
	private int a=10;
	protected int b=20;
	public static int c = 30;   //��� X ������
	public void display() {
		System.out.println("Super: display() call...");
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
	public void display() {
		// overriding
		System.out.println("Sub: display() call...");
	}
}
public class MainClass {
	public static void main(String[] args) {
//		Super sp = new Super();
		Sub s = new Sub();
		s.display();
		System.out.println("s.b="+s.b);
		s.b=100;
		System.out.println("s.b="+s.b);
	}
}
