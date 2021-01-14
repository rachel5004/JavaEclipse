class A{
	static int b = 100;
	int c = 200;
	public static void disp() {
		System.out.println("A disp: call...");
	}
	public static void display() {
		System.out.println("A: disp call");
	}
}
public class °´Ã¼ÁöÇâ {
	static int a=10;
	public static void disp() {
		System.out.println("disp: call...");
	}
	public static void main(String[] args) {
		System.out.println("a="+a);
		disp();
		A.display();
		System.out.println("b="+A.b);
		A a = new A();
		a.disp();
		System.out.println("a.c="+a.c);
	}
}
