class Super{
	int a = 100;
	public void display() {
		System.out.println("Super: display() call...");
	}
}
class Sub extends Super{
//	Super s = new Super(); //has-a (����Ŭ����) ����Ұ� �״�� ���
	int a = 1000;
	public void display() {
		System.out.println("Sub: display() call...");
	}
	int b = 200;
	public void bbb() {
		System.out.println("Sub: bbb() call...");
	}
}
	
class ����{
	public void run(){
		System.out.println("�ȴ´�!!");
	}
}
class �� extends ����{
	public void run() {
		System.out.println("�Ұ� �ȴ´�!!");
	}
}
class ���� extends ����{
	public void run() {
			System.out.println("������ �ȴ´�!!");
		}
	 
}
class �� extends ����{
	public void run() {
		System.out.println("���� �ȴ´�!!");
	}
	
}	
	
	
public class MainClass4 {
	public static void main(String[] args) {
		System.out.println("======super======");
		Super s = new Super();
		System.out.println(s.a);
		s.display();
		System.out.println("======sub======");
		Sub sub = new Sub();
		System.out.println("a="+sub.a+",b="+sub.b);
		sub.bbb();
		sub.display();
		System.out.println("======super>sub=====");
		Super s1 = new Sub(); //super�� ����+sub�� �޼ҵ�
		s1.display();
		System.out.println("a="+s1.a);
		
		
		
        // Ŭ������ �̿ϼ��� Ŭ���� (�߻�Ŭ����,�������̽�) => �޸𸮿� Ŭ������ ���� �� �� ���� 
        // ���� Ŭ������ �޾Ƽ� ó�� : ��ӹ��� Ŭ������ ������ �ִ� ��� 
        
        // double d=int
        // Sub s2=(Sub)s;
        // int i=(int)double
        
        /*
         *   ���� Ŭ������ ������ �޴� ���
         *   class A
         *   class B extends A
         *   
         *   A a=new B();
         *   =   =======
         *   
         *   1. ��������� AŬ������ �ִ� ������ ����Ѵ� 
         *   2. �޼ҵ�� ������ Ÿ���� ���� ���� 
         */
        ���� ani=new ��();
        ani.run();
        ani=new ��();
        ani.run();
        ani=new ����();
        ani.run();
        // �����Ͱ� ������ �ִ� => �迭 (�迭������ ��� �����͸� ����)
        // �ٸ� ������ Ŭ������ ������ �ִ� (����� �޾Ƽ� ����Ŭ������ ����) Object�� �����Ѵ� 
        /*
         *   Sub sub=new Sub();
         *   Super sup=new Sub();
         *   Object obj=new Sub();
         */
        Object obj=new Sub();
        // ����Ŭ���� ���� => �������̵� �޼ҵ� 
        
        //Sub ss=new Super(); ��� ����
        Sub ss=new Sub();
        Super su=new Super();
        //ss=(Sub)su;
        //su=ss;
        /*
         *   �����ڿ� ���� ȣ��Ǵ� �޼ҵ尡 �޶����� 
         *   ===============================
         *   ���� ���ε� 
         *   C��� : �������ε� => �����Լ� : ����ø��� �޼ҵ��� �ּҸ� ���� ,����� �ּҸ� ���� 
         */
		
	}
}
