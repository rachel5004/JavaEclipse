package com.sist.main;
/*
 *    Ŭ������ ���� 
 *    1) �Ϲ� Ŭ���� 
 *       ���������� class className{
 *          ================
 *            ����(����,����)
 *          ================
 *            �޼ҵ� (���)
 *          ================
 *            ������ 
 *          ================
 *       }
 *    2) �߻�Ŭ���� : �̿ϼ� Ŭ���� (�޼ҵ常 ����) => �������� ����� �ִ� ��� , ���ϻ��
 *       ���������� abstract class className{
 *          ==============
 *           ���� (����,����)
 *          ==============
 *            ������ �޼ҵ� : 
 *          ==============
 *            ����� �޼ҵ� => �ݵ�� ��ӹ��� Ŭ������ �����ؼ� ��� 
 *            ��) �Դ´�() , �ȴ´�() ...
 *            ��) ��ư Ŭ�� , ���콺 Ŭ��
 *            �������̵� : ���α׷��� �°� �����ؼ� ��� 
 *          ==============
 *            ������
 *          ==============
 *       }
 *     ***3) �߻�Ŭ������ ���� => �������̽� (���߻��)
 *        �� , �ڵ��� , ����� 
 *        class Ʈ�������� implements ��,�ڵ���,����� 
 *        ���������� interface interface��{
 *           ==================
 *            ���� : ��������� 
 *           ==================
 *            ����� �޼ҵ� 
 *           ==================
 *            ������ �޼ҵ� => JDK 1.8�̻� 
 *              default 
 *              static 
 *           ==================
 *        }
 *      4) ���� Ŭ���� : ���������α׷� , ������ , ��Ʈ��ũ
 *           = ���Ŭ���� 
 *             class A
 *             {
 *                ========
 *                  ����
 *                ========
 *                 �޼ҵ�
 *                ========
 *                 ������
 *                ======== ===> �������� ���Ǵ� ����,�޼ҵ� 
 *                class B ===> AŬ������ ������ �ִ� ��� �޼ҵ�,���� => ����� �����Ӵ� 
 *                {
 *                   =========
 *                    ����
 *                   =========
 *                    �޼ҵ�
 *                   =========
 *                    ������ 
 *                   =========
 *                }
 *             }
 *           = �͸��� Ŭ���� : ��Ӿ��� �������̵��� �����ϴ� 
 *             class A
 *             {
 *                public void display(){}
 *             }
 *             class B extends A
 *             {
 *                public void display(){}
 *             }
 *             
 *             class A
 *             {
 *                public void display(){}
 *             }
 *             
 *             class B
 *             {
 *                 A a=new A(){
 *                   public void display(){} 
 *                 }
 *             }
 *           = ����Ŭ���� : ���󵵰� ���� ���� 
 *           class A
 *           {
 *              public void display()
 *              {
 *                 class B
 *                 {
 *                    
 *                 }
 *              }
 *           }
 *      5) ���� Ŭ���� : ����� �� �� ���� Ŭ���� (���������θ� ����� ����) => ���� 
 *                     String , Math , System ... (������ ��� �״�� ���)
 *         ���������� final class className{
 *            =============
 *              ����
 *            =============
 *             �޼ҵ�
 *            =============
 *             ������ 
 *            =============
 *         }
 *         
 */
import javax.swing.*;
import javax.swing.table.*;
public class Class���� extends JFrame{
	JTable table;
	DefaultTableModel model;
	public Class����() {
		String[] col = {"�̸�","�ּ�","��ȭ"};
		String[][] row = new String[0][3];
		model = new DefaultTableModel(row,col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				return super.isCellEditable(row, column);
			};
			
		};
			
		table = new JTable(model);
		JScrollPane js= new JScrollPane(table);
		add("Center",js);
		String[] data = {"ȫ�浿","����","010-0000-0000"};
		model.addRow(data);
		setSize(450,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Class����();
	}
	

}
