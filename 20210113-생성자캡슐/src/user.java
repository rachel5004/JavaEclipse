import java.util.Scanner;

public class user {
	String name, id, pwd, pwdc, loc, email;
	int birth, tel;
	boolean sex, sms, mail;
	
	user(){
		System.out.println("이름: ");
		System.out.println("아이디: ");
		System.out.println("비밀번호: ");
		System.out.println("비밀번호 확인: ");
		System.out.println("생년월일: ");
		System.out.println("주소: ");
		System.out.println("휴대전화 번호: ");
		System.out.println("SMS 수신여부: ");
		System.out.println("이메일: ");
		System.out.println("정보수신메일: ");
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
		System.out.print("이름 입력:");
		String name=scan.next();
		System.out.print("아이디 입력:");
		String id=scan.next();
		System.out.print("비밀번호 입력:");
		String pwd=scan.next();
		System.out.print("비밀번호 확인:");
		String pwdc=scan.next();
		System.out.print("성별 입력:");
		String sex=scan.next();
		System.out.print("주소 입력:");
		String loc=scan.next();
		System.out.print("전화번호 입력:");
		String tel=scan.next();
		System.out.print("연봉 입력:");

	}
	
}
