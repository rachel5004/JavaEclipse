class student extends human{
	public void study() {
		System.out.println("����");
	}
}
public class human {
	static void eat() {
		System.out.println("�ȳ�");
	}
	static void walk() {
		System.out.println("���ѹ���");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human me = new human();
		me.eat();
		
		student sd = new student();
		sd.study();
		
		
	}

}
