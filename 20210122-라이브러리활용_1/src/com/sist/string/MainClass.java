package com.sist.string;
/*
 *   스트링 클래스 
 *   ===========
 *     char[]을 제어하는 프로그램 
 *     String => 클래스 
 *            => 문자열을 저장 
 *            => 문자열을 쉽게 제어가 가능하게 만든 클래스 
 *            => 문자열을 저장하는 일반 데이터형으로 사용이 가능
 *               ***String name=""
 *               String name=new String(""); 
 *     String클래스는 Call By Reference를 사용 할 수 없다 
 *     
 *     => 메소드 호출 
 *        값만 전송 : Call By Value (복사본) => 기본데이터형 (int a,int b)
 *        주소 전송 : Call By Reference     => 배열, 클래스 (A a) => String은 예외 조건
 *     => 클래스와 클래스연결 => 메소드호출 
 *     
 *     String에서 기능 
 *     =============
 *     변환 
 *       = 대문자 변경 : toUpperCase() => "aaa".toUpperCase() => "AAA" String
 *       = 소문자 변경 : toLowerCase() => String
 *       = 공백문자 제거 : 좌우의 공백만 제거 => trim() " aaa ".trim() => "aaa" String
 *       = 문자열 결합 : concat() => 빈도가 작다  (+)
 *                    "Hello".concat("Java") ==> "HelloJava" => "Hello"+"Java"
 *     제어
 *       ######  모든 문자열은 시작번호가 0번부터 시작한다
 *       "Hello Java"
 *        0123456789   ==> length():10 
 *       = 문자열 길이 : length()
 *       = 문자 한개를 가지고 온다 : charAt()  => charAt(6)
 *       =================================
 *       = 시작문자열 : startsWith()
 *       = 끝나는 문자열 : endsWith()
 *       ================================= 검색기 제작  
 *       = 포함문자 : contains() : 추천 
 *       "hello" "Hello" => ID,Password
 *       = 문자비교 : equals():대소문구분 , equalsIgnoreCase():대소문자 구분없이 비교
 *         "Hell.o.java" => 
 *       = 문자위치 찾기 : indexOf():처음 , lastIndexOf():마지막에 있는 문자
 *         "ABCADEF".replace('A','K')  ==> KBCKDEF
 *       = 문자변환 : replace:한글자,replaceAll:정규식
 *         "abcAbc1234한글"=> replaceAll("[^0-9]","") => "1234"
 *         숫자 [0-9]
 *         알파벳 [A-Z] [a-z] => [A-Za-z] 
 *         한글 [가-힣]
 *         
 *         "red,green,blue,yellow,black"
 *       = 문자분해 
 *         = split : 구분자별로 배열에 저장 
 *         = substring : 문자의 위치 지정 
 *       = 객체를 문자를 변환 : toString()
 *       = 모든 데이터형을 문자열로 변환 => valueOf()
 *       = 문자 크기 비교 (정렬) : "ABC" "ACD" compareTo() int => 같다(0),왼쪽: 1 , 오른쪽 :-1
 *          "aaa".compareTo("aaa") => 0
 *     
 */
public class MainClass {

	public static void main(String[] args) {
        String str="hello";
        String s=str.toUpperCase();
        String s1=str.toLowerCase();
        System.out.println(str);
        System.out.println(s);
        String s2=str.concat("Java");
        System.out.println(s2);
        System.out.println(str);
	}

}







