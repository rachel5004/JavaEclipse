// ������� , �������� => �켱 ���� (�������� => �������) 
		// ���������� ��������� �������� ���� => this�� ���� 
		// ��� ����޼ҵ�(�ν��Ͻ��޼ҵ忡�� this�� ���ȴ�) => ������ ���� ���� this������ ���� 
 //�ν��Ͻ��� �����ø��� => ���� this��� �ڽ��� ��ü�� ������ �ִ� 
		 //   this => �����Ͻÿ� �ڵ� ���� 		


class Student{   //super =  Object
	private int hakbun;    // û�� = member variable
	private String name;
	private String sex;
//	public void Student(int hakbun, String name, String sex) {  //���� = ��������
//		this.hakbun =  hakbun; // this = member variable ȣ��
//		this.name = name;
//		this.sex = sex;
//	}
	public Student(int hakbun, String name, String sex) {  //������(���۰��� �����Ҷ� �Ҵ�)
		this.hakbun =  hakbun;
		this.name = name;
		this.sex = sex;
	}
	public void print() {
		System.out.println("�й�: "+hakbun);
		System.out.println("�̸�: "+name);
		System.out.println("����: "+sex);
		System.out.println("this="+this);
	}
}
public class MainClass {

	public static void main(String[] args) {
		
//		Student st1 = new Student();
//		System.out.println("s1="+st1);
//		st1.Student(1, "ȫ�浿", "����");
//		st1.print();
//		Student st2 = new Student();
//		System.out.println("s2="+st2);
//		st2.print();
		
		Student st1 = new Student(1, "ȫ�浿", "����"); //������
		Student st2 = new Student(2, "��û", "����"); 
		
	}

}
