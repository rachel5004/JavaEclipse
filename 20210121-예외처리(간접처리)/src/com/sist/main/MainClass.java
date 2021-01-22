package com.sist.main;
/*
 *    1. Ŭ���� ����� : ���� ======> import (���̺귯�� ����� => .jar) => ���(������)
 *         = ����
 *           = �޸𸮸� ���� ���� ( new ��� ) = �ν��Ͻ����� 
 *           = �޸𸮸� �Ѱ��� ��� = static 
 *         = �޼ҵ� => ������(�����) / �Ű�����(����ڷκ��� ���۹��� ��)  
 *                   => �⺻�������� => ��Ƽ� �Ѱ��� ��������(Ŭ����)
 *                   1) ������ 
 *                      ������� ���� void
 *                      �Ϲݵ����� (int ,double,char,boolean,long..)
 *                      Ŭ���� : �󼼺��� 
 *                      �迭 : ���
 *                   2) �Ű�����
 *                      �⺻�������� 
 *                      Ŭ���� , �迭 
 *           = ������ (�׻� ���� �������������� ������ ����)
 *              ���׿����� ( ++ , -- , ! , (type))
 *              ���׿����� 
 *                ���(+,-,*,/,%) : ����ȯ 
 *                �񱳿����� ( == , != , < , > , <= , >=)
 *                �������� ( && , || )
 *                          ������ �Ⱓ�� ���� (&&) , ������(||)
 *                ���Կ����� ( = , +=  , -= )
 *           = ���
 *             ���ǹ� ( if , if~else , if ~ else if ~ else if ~ else )
 *             �ݺ��� ( while , for )
 *             �ݺ����� ( break )
 *           
 *    2. �����߻� �����ϴ� ���α׷� : ����ó��
 *       �̸� �����ؼ� => ���� 
 *       = ���� ���� => try~catch
 *          try : ������� �� �� �ִ� ���� 
 *          catch : ���α׷����� �Ǽ� , ����ڰ� �Է� , ������ �Ϸ� 
 *          finally (������ ����) => ����Ŭ , ��Ʈ��ũ , ���� => (����: close)
 *          => �ڵ����� ������ ó���ϴ� ���� �ƴϴ� (����)
 *          => catch�� ����Ǵ� ����ó�� (������ ����� ����) => ����ó�� Ŭ������ ����
 *          => �� �𸥴� catch(Exception e)
 *          => �����޼��� Ȯ�� 
 *             = getMessage() : ����Ŭ ���� (null) => �����޽����� ��� 
 *             = printStackTrace() *** ����  => ��ġ ���� 
 *          => try~catch�� �׻� => �ҽ� ��ü�� ������� ���� �ʴ´� (������ ����Ǵ� �κ�)
 *       = ���� ȸ�� => throws
 *       = ���� ��ȯ => ���ܹ߻� => �ٸ� ���ܸ� �߻��ؼ� ȭ�� ����  (throw)
 *    3. ���̺귯�� Ȱ��
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 *    �ʱ�ȭ => ó���� �ʿ��� �����Ͱ��� ���� 
 *    ������ => 0 => page=1
 *    =====================
 *    class Movie{
 *       int page=1;
 *    }
 *    
 *    class Login
 *    {
 *        String id,pwd;
 *        => cookie
 *        {
 *           ���� 
 *        }
 *        Login()
 *        {
 *           ����
 *        }
 *    }
 */
public class MainClass extends JFrame implements ActionListener{
    // JFrame ������ => MainClass �������� ��� ����� ��� �� �� �ִ�
    // ActionListener => Menu,Button,TextField(Enter)
	// ���� Ŭ���� 
	JTextField tf; // �Է�â(����) => ID,Password 
	JTextArea ta; // �Է�â => ������ �Է� 
	JButton bu1,bu2;
	// class �ȿ��� ���� : �⺻�������� , �迭 , Ŭ����(�������� �ѹ��� �����ϴ� ����) 
	//                  ========== �Ѱ��� ���� 
	// ���Ӱ��� ���� 
	int[] com={5,8,3};
	int[] user=new int[3];
	int s,b; // ������� => �ʱ�ȭ�� �ȵ� ���� => 0������ �ʱ�ȭ 
	public MainClass()// ��������� ���� �ʱ�ȭ ��� 
	{
	   tf=new JTextField(10); // Ŭ������ �ʱ�ȭ => new 
	   tf.setEnabled(false);
	   ta=new JTextArea();
	   JScrollPane js=new JScrollPane(ta);
	   ta.setEnabled(false);// ��Ȱ��ȭ => ��Ʈ ��� 
	   bu1=new JButton("����");
	   bu2=new JButton("����");
	   // �����쿡 ��ġ 
	   JPanel p=new JPanel();
	   p.add(tf);p.add(bu1);p.add(bu2);
	   
	   add("Center",js);
	   add("South",p);
	   
	   //������ ũ�� ���� 
	   setSize(350, 500);
	   setVisible(true);
	   
	   tf.addActionListener(this);// ���ڸ� �Է��ϰ� ���� ġ�� => actionPerformed
	   bu1.addActionListener(this);
	   bu2.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MainClass m=new MainClass();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bu2)
		{
			System.exit(0);// ���α׷� ���� 
		}
		else if(e.getSource()==bu1)
		{
			JOptionPane.showMessageDialog(this, "������ �����մϴ�!!");
			bu1.setEnabled(false);// ��Ȱ��ȭ
			tf.setEnabled(true);// Ȱ��ȭ
			tf.requestFocus();// focus
		}
		else if(e.getSource()==tf)
		{
			// �Է��� ���� ������ �´� 
			String strNum=tf.getText();
			if(strNum.length()<1)
			{
				String msg="���ڸ� ������ �Է��ϼ���";
				ta.append(msg+"\n");
			}
			
			// ���ڿ� => ������ȯ 
			try
			{
		     	int num=Integer.parseInt(strNum); // javac    java
		     	/*
		     	 *    CheckException     UnCheckException 
		     	 *    ==============
		     	 *    �����Ͻ� �˻�         ����ÿ� �˻� 
		     	 *    = �ݵ�� ����ó��      = �ʿ��Ҷ� ����ó�� 
		     	 *    IO (�����) ***
		     	 *    URL (��Ʈ��ũ)
		     	 *    SQL (�����ͺ��̽�) ***
		     	 *    Thread (������) 
		     	 *    Ŭ���� ���� 
		     	 *    "123" " 123"  "admin" " admin".trim()
		     	 */
			}catch(NumberFormatException ex) // RuntimeException : ������ ���� 
			{
				String msg="������ �Է��� �����մϴ�!!";
				ta.append(msg+"\n");
				tf.setText("");
				tf.requestFocus();
				// ó������ �ٽ� ���ư��� 
				return;
			}
			
		}
	}

}





