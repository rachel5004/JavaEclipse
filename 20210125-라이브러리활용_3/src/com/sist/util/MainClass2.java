package com.sist.util;
// StringTokenizer => java.util.* 
/*
 *   단어별로 문지열을 분리하는 역할 (빅데이터)
 *   = hasMoreTokens()
 *   = countTokens()
 *   = nextToken()
 *   
 *   StringTokenizer(colors,",");
 *                   ======
 *                   제어할 문자열  , 구분자 
 */
import java.util.*;
public class MainClass2 {
	public static void main(String[] args) {
		String color = "red|yello|blue|green|black|white";
		// |에서 이스케이프가 필요없음
		
		StringTokenizer st =  new StringTokenizer(color,"|");
		while(st.hasMoreTokens()) {  // 갯수를 모를 때
			System.out.println(st.nextToken());
			
		}
	}

}















