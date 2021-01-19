// 학교 => 반복 제거 , 유지보수가 편하다  => 상속(추상 = 공통점)

class human{
	private int age;
	private String name, sex;
}

class student extends human{
	private int hakbun;
	private String sub;
}
class worker extends human{
	private int sabun;
	private String dept;
}
class prof extends human{
	private int pbun;
	private String sub;
}
public class MainClass3 {

}
