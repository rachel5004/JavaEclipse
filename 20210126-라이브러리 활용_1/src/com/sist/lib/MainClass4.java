package com.sist.lib;
// MessageFormat = SQL ������ ���� ��
// data�� ������ ������� ����� �� (Oracle ����)
import java.text.*;
public class MainClass4 {
	public static void main(String[] args) {
		String msg = "�̸�:{0}\n����:{1}\n��ȭ:{2}\n�ּ�:{3}\n����:{4}";
		
		// Object�� ��� ���������� ���� �� �ִ�
		Object[] obj =  {"ȫ�浿","����","010-1111-1111","����",30};
		String res = MessageFormat.format(msg, obj);
		System.out.println(res);
		
	}
}
