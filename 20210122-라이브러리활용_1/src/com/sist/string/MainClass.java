package com.sist.string;
/*
 *   ��Ʈ�� Ŭ���� 
 *   ===========
 *     char[]�� �����ϴ� ���α׷� 
 *     String => Ŭ���� 
 *            => ���ڿ��� ���� 
 *            => ���ڿ��� ���� ��� �����ϰ� ���� Ŭ���� 
 *            => ���ڿ��� �����ϴ� �Ϲ� ������������ ����� ����
 *               ***String name=""
 *               String name=new String(""); 
 *     StringŬ������ Call By Reference�� ��� �� �� ���� 
 *     
 *     => �޼ҵ� ȣ�� 
 *        ���� ���� : Call By Value (���纻) => �⺻�������� (int a,int b)
 *        �ּ� ���� : Call By Reference     => �迭, Ŭ���� (A a) => String�� ���� ����
 *     => Ŭ������ Ŭ�������� => �޼ҵ�ȣ�� 
 *     
 *     String���� ��� 
 *     =============
 *     ��ȯ 
 *       = �빮�� ���� : toUpperCase() => "aaa".toUpperCase() => "AAA" String
 *       = �ҹ��� ���� : toLowerCase() => String
 *       = ���鹮�� ���� : �¿��� ���鸸 ���� => trim() " aaa ".trim() => "aaa" String
 *       = ���ڿ� ���� : concat() => �󵵰� �۴�  (+)
 *                    "Hello".concat("Java") ==> "HelloJava" => "Hello"+"Java"
 *     ����
 *       ######  ��� ���ڿ��� ���۹�ȣ�� 0������ �����Ѵ�
 *       "Hello Java"
 *        0123456789   ==> length():10 
 *       = ���ڿ� ���� : length()
 *       = ���� �Ѱ��� ������ �´� : charAt()  => charAt(6)
 *       =================================
 *       = ���۹��ڿ� : startsWith()
 *       = ������ ���ڿ� : endsWith()
 *       ================================= �˻��� ����  
 *       = ���Թ��� : contains() : ��õ 
 *       "hello" "Hello" => ID,Password
 *       = ���ں� : equals():��ҹ����� , equalsIgnoreCase():��ҹ��� ���о��� ��
 *         "Hell.o.java" => 
 *       = ������ġ ã�� : indexOf():ó�� , lastIndexOf():�������� �ִ� ����
 *         "ABCADEF".replace('A','K')  ==> KBCKDEF
 *       = ���ں�ȯ : replace:�ѱ���,replaceAll:���Խ�
 *         "abcAbc1234�ѱ�"=> replaceAll("[^0-9]","") => "1234"
 *         ���� [0-9]
 *         ���ĺ� [A-Z] [a-z] => [A-Za-z] 
 *         �ѱ� [��-�R]
 *         
 *         "red,green,blue,yellow,black"
 *       = ���ں��� 
 *         = split : �����ں��� �迭�� ���� 
 *         = substring : ������ ��ġ ���� 
 *       = ��ü�� ���ڸ� ��ȯ : toString()
 *       = ��� ���������� ���ڿ��� ��ȯ => valueOf()
 *       = ���� ũ�� �� (����) : "ABC" "ACD" compareTo() int => ����(0),����: 1 , ������ :-1
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







