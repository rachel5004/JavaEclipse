package com.sist.map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;
/*
 *   java.lang 
 *   =========
 *     Object => 모든 클래스를 모아서 관리 (모든 데이터형을 받을 수 있다)
 *               형변환 
 *               Object obj=new String();
 *               String str=(String)obj;
 *               => 자바에서 제공하는 메소드중에 클래스를 리턴형으로 가지고 있는 경우
 *                  모든 메소드가 Object
 *               ArrayList => 저장된 값을 읽어 온다 
 *                            public Object get(int index) =>  (String)list.get(0)
 *     String => 웹 , 모바일 , 윈도우 => 문자열로 처리 
 *     Wrapper => Integer , Double , Boolean => 문자열을 변환 
 *                parseInt() parseDouble() parseBoolean
 *     StringBuffer => 파일에 저장된 문자열이 길 경우 => append
 *   java.util
 *   ==========
 *     StringTokenizer : 구분문자로 문자열을 자른다 split
 *                       ===================== 영화,맛집,여행,쇼핑 => 이미지가 여러개 이미지명,이미지명...
 *     Date : 시스템의 날짜 = 오라클 
 *     Calendar : 달력 (날짜 조작)
 *     SimpleDateFormat , MessageFormat(웹 => layout) , ChoiceFormat(switch,if)
 *     자료구조 
 *      List : ArrayList,Vector(네트워크),LinkedList,Stack
 *             ========= 데이터베이스 
 *      Set : HashSet , TreeSet
 *            ======= 중복없는 데이터를 저장 
 *      Map : HashMap , HashTable , Properties: => session(서버) , cookie , request , response
 *                                      id , "admin"           ?movieid=111111
 *                                      setAttribute("key","value")
 *                                       Map map=new HashMap()
 *                                       map.put(key,value);
 *            =======
 *             Spring , MyBatis => <select id="movie">SQL문장</select>
 *             ======
 *             <bean id="board" class="Board"> : 스프링은 클래스 관리자(생성~소멸)
 *    ==> 형변환이 없이 Collection => 데이터형을 통일화 : 제네릭스 <TYPE>
 *    ==> 메소드 구분 , 클래스 찾기 (인덱스) => if대신 : 어노테이션 
 *    
 *    WHERE no BETWEEN 1 AND 10
 *    WHERE no>=1 AND no<=10
 *
 * Vector:네트워크 (ip,port) => Socket => 동기화
 *
 *   java.util => import를 반드시 사용  => import java.util.Vector , import java.util.*
 *                                      ========================
 *   Vector : 동기화 => 데이터수집 (10000개의 레시피 => 1500000) => Thread
 *   ======
 *    List => 순서가 있다,중복 데이터 저장이 가능
 *            ========= 인덱스 번호
 *            자료구조 : CURD(저장,수정,읽기,삭제)
 *             = 읽기 (데이터를 가지고 온다) => get(인덱스번호),elementAt(인덱스)
 *             = 저장 => add() , addElement()
 *             = 수정 => set() , setElement()
 *             = 삭제 => remove() , removeElementAt()
 *             = 갯수 => size()
 */
public class MainClass {
	public static void main(String[] args) {
		Vector vec = new Vector();
		Collections.addAll(vec,"홍길동","심청","김두한","이순신","강감찬");
		Collections.sort(vec);
		System.out.println(vec.size());
		
		for(int i =0;i<vec.size();i++) {
			String name = (String) vec.get(i);
			System.out.println(name);
		}
		
		ArrayList vec2 = new ArrayList();
		vec2.addAll(vec);
		
	}
}
