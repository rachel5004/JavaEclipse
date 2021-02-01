package com.sist.map;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class fileedit {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\javaDev\\javastudy\\20210128\\src\\com\\sist\\main\\db.properties"));
	
	}
}
