package com.sist.map;

import java.util.HashMap;

abstract class I{
	public abstract void display();
}
class A implements I{
	
}

class Container{
	HashMap map = new HashMap();
	public Container() {
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
	}
	public I getBean(String key) {
		return (I)map.get(key);
	}
}
public class MainClass4 {
	public static void main(String[] args) {
		Container con = new Container();
		I i=con.getBean("a");
		i.display();
	}
}
