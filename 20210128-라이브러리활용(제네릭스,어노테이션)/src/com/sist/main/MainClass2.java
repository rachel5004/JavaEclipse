package com.sist.main;
import java.util.*;
// 컬렉션 : ArrayList<> ,Vector<> , LinkedList<> Map<K,V> => 데이터를 통일(관련된)해서 묶어서 저장후 사용 
class A
{
	
}
public class MainClass2 {

	public static void main(String[] args) {
        ArrayList<String> list=
        		new ArrayList<String>();
        // 저장 
        list.add("홍길동");
        list.add("이순신");
        
        // 값 읽기 
        String name1=list.get(0);
        String name2=list.get(1);
        
        System.out.println(name1);
        System.out.println(name2);
        
        ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        
        ArrayList list3=new ArrayList();
        list3.add(1);
        list3.add("Hello");
        list3.add('A');
        list3.add("Hello");
        list3.add('A');
        list3.add("Hello");
        list3.add('A');
        list3.add(1);
        list3.add(1);
        list3.add(1); //1000개
        
        ArrayList<A> list5=new ArrayList<A>();
        
        
	}

}







