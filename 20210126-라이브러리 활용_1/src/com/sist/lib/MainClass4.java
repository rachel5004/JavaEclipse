package com.sist.lib;
// MessageFormat = SQL 문장을 만들 때
// data를 정해진 양식으로 출력할 때 (Oracle 형식)
import java.text.*;
public class MainClass4 {
	public static void main(String[] args) {
		String msg = "이름:{0}\n성별:{1}\n전화:{2}\n주소:{3}\n나이:{4}";
		
		// Object는 모든 데이터형을 받을 수 있다
		Object[] obj =  {"홍길동","남자","010-1111-1111","서울",30};
		String res = MessageFormat.format(msg, obj);
		System.out.println(res);
		
	}
}
