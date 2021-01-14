class SuperClass{
	int a = 10;
	int b = 20;
	
}
public class SubClass {
	
	SuperClass sc = new SuperClass();

	public static void main(String[] args) {
		
	SubClass s = new SubClass();
	System.out.println(s.sc.a);
	System.out.println(s.sc.b);
	
	}

}
