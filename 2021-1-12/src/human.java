class student extends human{
	public void study() {
		System.out.println("°øºÎ");
	}
}
public class human {
	static void eat() {
		System.out.println("³È³È");
	}
	static void walk() {
		System.out.println("¹÷¶Ñ¹÷¶Ñ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human me = new human();
		me.eat();
		
		student sd = new student();
		sd.study();
		
		
	}

}
