import java.util.Scanner;

public class user {
	String name, id, pwd, pwdc, loc, email;
	int birth, tel;
	boolean sex, sms, mail;
	
	user(){
		System.out.println("�̸�: ");
		System.out.println("���̵�: ");
		System.out.println("��й�ȣ: ");
		System.out.println("��й�ȣ Ȯ��: ");
		System.out.println("�������: ");
		System.out.println("�ּ�: ");
		System.out.println("�޴���ȭ ��ȣ: ");
		System.out.println("SMS ���ſ���: ");
		System.out.println("�̸���: ");
		System.out.println("�������Ÿ���: ");
	}
	user(String name, String id,String pwd,String pwdc,String loc,String email){
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.pwdc = pwdc;
		this.birth = birth;
		this.sex = sex;
	}
	public static void main(String[] args) {
		user u = new user();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�̸� �Է�:");
		String name=scan.next();
		System.out.print("���̵� �Է�:");
		String id=scan.next();
		System.out.print("��й�ȣ �Է�:");
		String pwd=scan.next();
		System.out.print("��й�ȣ Ȯ��:");
		String pwdc=scan.next();
		System.out.print("���� �Է�:");
		String sex=scan.next();
		System.out.print("�ּ� �Է�:");
		String loc=scan.next();
		System.out.print("��ȭ��ȣ �Է�:");
		String tel=scan.next();
		System.out.print("���� �Է�:");

	}
	
}
