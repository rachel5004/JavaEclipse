class Super{
	private int a=10;
	protected int b=20;
	public static int c = 30;   //상속 X 공통사용
	public void display() {
		System.out.println("Super: display() call...");
	}
	public Super() {   //생성자는 상속 X
		System.out.println("Super: 생성자 함수()...");
	}
}
class Sub extends Super{
	private int c=10;
	public Sub() {
//		this.display();           //녹색=public,황색=protected,적색=private
		System.out.println("Sub: 생성자() call...");
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
