package com.sist.util;
// StringTokenizer => java.util.* 
/*
 *   �ܾ�� �������� �и��ϴ� ���� (������)
 *   = hasMoreTokens()
 *   = countTokens()
 *   = nextToken()
 *   
 *   StringTokenizer(colors,",");
 *                   ======
 *                   ������ ���ڿ�  , ������ 
 */
import java.util.*;
public class MainClass2 {
	public static void main(String[] args) {
		String color = "red|yello|blue|green|black|white";
		// |���� �̽��������� �ʿ����
		
		StringTokenizer st =  new StringTokenizer(color,"|");
		while(st.hasMoreTokens()) {  // ������ �� ��
			System.out.println(st.nextToken());
			
		}
	}

}















