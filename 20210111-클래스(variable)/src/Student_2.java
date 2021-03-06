
public class Student_2 {
	////// 클래스안에 선언된 변수 (멤버변수) ==> 다른 클래스,현재 클래스에 사용 => 프로그램 종료시까지 메모리를 유지 
	/*
	 *    멤버변수 
	 *     = 따로 저장되는 변수  : 인스턴스 변수 
	 *             new이용해서 다른 메모리 공간을 생성 => 사용
	 *     = 한개만 저장되는 변수 : static이 있는 변수 (공유변수,클래스변수)
	 *    지역변수 
	 *     = 메소드 안에서만 사용하는 변수 (메소드가 종료하면 사라지는 변수)
	 *       => 일반 지역변수 , 매개변수 
	 *       void display(int a)
	 *       {
	 *           int b=10;
	 *       }// a,b는 메모리에 의해서 사라진다  => 메소드를 호출시마다 생성되는 변수 
	 *       
	 *    =============================================================
	 *                     선언위치     메모리 생성 시점    메모리 소멸 시점 
	 *    =============================================================
	 *    인스턴스변수        클래스블럭    new를 이용할때(프로그래머가 생성)
	 *    ============================================================프로그램 종료
	 *    공유변수(static)   클래스블럭    JVM이 클래스를 읽어을때(자동 생성)
	 *    ============================================================
	 *    지역변수           메소드블럭    메소드가 호출될때   메소드 종료가 되면 
	 *      매개변수,메소드안에 생성되는 변수 
	 *    ============================================================
	 *    
	 *    프로그램 제작 
	 *    ==========
	 *    요구사항분석   =====  설계  =========== 구현  ====== 테스팅 
	 *                      =====             ====
	 *                      클래스             메모리에 저장 (객체)
	 *                      = 필요한 데이터
	 *                        => 멤버변수  
	 *                      = 기능 설정 
	 *                        => 메소드 
	 *                        
	 *    page 230 
	 */
    String name; // 모든 클래스는 4byte
    int kor,eng,math,total;
    double avg;
    static String school="SIST";// 명시적 초기화 
    // new => new를 사용시마다 새로운 메모리 공간을 생성 (동적 메모리 할당)
    //////
    /*
     *    클래스영역에 변수 선언 => 자동 초기값
     *    1. int  => 0
     *    2. long => 0L
     *    3. float => 0.0F
     *    4. double => 0.0
     *    5. boolean => false
     *    6. String => null
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student_2 s1=new Student_2();
        System.out.println("s1="+s1);
        s1.name="이순신";
        s1.kor=90;
        s1.eng=80;
        s1.math=100;
        s1.total=s1.kor+s1.eng+s1.math;
        s1.avg=s1.total/3.0;
        
        Student_2 s2=new Student_2();
        System.out.println("s2="+s2);
        s2.name="이순신";
        s2.kor=90;
        s2.eng=80;
        s2.math=100;
        s2.total=s1.kor+s1.eng+s1.math;
        s2.avg=s1.total/3.0;
        
        Student_2 s3=new Student_2();
        System.out.println("s3="+s3);
        s3.name="이순신";
        s3.kor=90;
        s3.eng=80;
        s3.math=100;
        s3.total=s1.kor+s1.eng+s1.math;
        s3.avg=s1.total/3.0;
        
        s1.school="쌍용";
        s2.school="쌍용2";
        Student_2.school="쌍용3";// 인스턴스 , 클래스명으로 접근이 가능 : 메모리 공간을 1개만 사용 
        System.out.println(s1.school);
        System.out.println(s2.school);
        System.out.println(s3.school);
        
	}

}





