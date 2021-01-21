package com.sist.main2;
interface Database{
	public void connect();
	public void disconnect();
}
class Oracle implements Database{

	@Override
	public void connect() {
		System.out.println("Oracle connect");
	}

	@Override
	public void disconnect() {
		System.out.println("Oracle disconnect");
	}	
}
class MySQL implements Database{

	@Override
	public void connect() {
		System.out.println("MySQL connect");
	}

	@Override
	public void disconnect() {
		System.out.println("MySQL disconnect");
	}	
}
class MsSQL implements Database{

	@Override
	public void connect() {
		System.out.println("MsSQL connect");
	}

	@Override
	public void disconnect() {
		System.out.println("MsSQL disconnect");
	}	
}
class DB2 implements Database{

	@Override
	public void connect() {
		System.out.println("DB2 connect");
	}

	@Override
	public void disconnect() {
		System.out.println("DB2 disconnect");
	}	
}
class container{     //component С§Че
	public Database dbselect(String type) {
		Database db = null;
		if(type.equals("Oracle"))
			db = new Oracle();     //component
		else if(type.equals("MySQL"))
			db = new MySQL();
		else if(type.equals("MsSQL"))
			db = new MsSQL();
		else if(type.equals("DB2"))
			db = new DB2();

		return db;
	}
}
public class MainClass {
	public static void main(String[] args) {
		container c = new container();
		Database db = c.dbselect("Oracle");
		db.connect();
		db.disconnect();
		System.out.println("==================");
		db = c.dbselect("DB2");
		db.connect();
		db.disconnect();
	}
	
}
