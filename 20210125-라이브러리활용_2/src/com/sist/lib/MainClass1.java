package com.sist.lib;
/*
 *   java.lang.* => ���α׷����� ����� �� �ִ� Ŭ������ ����
 *   =========== 
 *   1) Ư¡ 
 *      = import�� ������ �� �ִ� 
 *   2) �ڹٿ��� �����ϴ� Ŭ���� 
 *      = Object
 *        = toString() ���ڿ� ��ȯ (��ü) => ��ü�� �ּҰ� ���
 *        = equals() ��ü�� ��ü�� �� 
 *        = finalize() : �Ҹ��� (�޸� ���� �ڵ� ȣ��) => System.gc()
 *        = clone() : ���� 
 *          = ���� : ���ο� �޸𸮸� ����� �ش� 
 *          = ���� : �ּҰ� ���� (�������� �Ѱ��� �޸𸮸� ����)
 *                  ������,��Ʈ��ũ����,����Ŭ�������� 
 *            ===================== �������� Ŭ�������� �Ѱ��� �ּҷ� �����ϴ� ��� (�̱���)
 *            ==> ����(��Ʈ��ũ),�����ͺ��̽�:���������� �̿��ؼ� �Ѱ��� ��ü�� ��� Ŭ������ ����
 *            ==> ����Ʈ���� ���� : �̱���,���丮 ���� => ������ �ַ� �̿�(������)
 *      = String : ���ڿ��� ���õ� Ŭ���� 
 *          = �Ϲݵ�����(�⺻��) 
 *          = Ŭ������ (���=�޼ҵ�)
 *          = �޼ҵ忡�� �Ű������� �̿��ؼ� ������ ���� 
 *            �Ű����� �̿�� 
 *             1) Call By Value (�Ϲ� �����Ͱ�) => �޸𸮰� ���� ���� => �⺻��������,String
 *             2) Call By Reference => �迭 , Ŭ������ ��쿡 �ַ� ��� (�ּ� �Ѱܼ� �ּ� ��ü�� �����Ͱ� ����)
 *          = �ֿ� ��� (�޼ҵ�) 
 *            1) equals() : ���� ����� ���ڿ��� ��  ==> ����: public boolean equals(String str)
 *               ��)  
 *                   String id="";
 *                   String id2="";
 *                   id.equals(id2)
 *               = �α��� (ID,Password)
 *               = ID�ߺ� 
 *            2) substring() : ���ڿ��� �ڸ��� 
 *               = �����ε� : �������� �޼ҵ尡 ������� �ִ�
 *               ����:
 *                    public String substring(int s) : ������ ��ġ�κ��� ��ü�� �о� �ö�
 *                    public String substring(int s,int e) : ���ڿ� �߰����� �ڸ��� 
 *                         # ���������ڴ� ���ܵȴ� 
 *               = �ڹ��� ���ڿ��� ���۹�ȣ�� 0���̴�  
 *            3) ã�� : �տ��� ã�� = indexOf()
 *                     �ڿ��� ã�� = lastIndexOf() 
 *                     ============> public int indexOf(ã�� ����,ã�� ���ڿ�)
 *            4) ���ڿ��� ã�� 
 *               startsWith() : ���۹��ڿ��� ���� ���
 *               endsWith() : ������ ���ڿ��� ���� ���
 *               contains() : ���ڿ��߿� ���Ե� ���
 *               
 *            5) ������ ���� : length()
 *            6) ���ڿ� ��ȯ (��� ���������� ���ڿ��� ��ȯ) : valueOf() => ���� : static
 *            7) ���ڿ��и� : split => public String[] split(String regex) 
 *               
 *      = StringBuffer/StringBuilder
 *        StringBuffer = StringBuilder : ������ ���� (��Ʈ��ũ���� ������ ������ �о ���� : StringBuilder)
 *        ============
 *          = append() => ���ڿ� ���� 
 *          = toString() => ����� ���ڿ��� �о� ���� ���
 *      = Wrapper : �Ϲݵ������� �����ϱ� ���� ����� �� Ŭ���� 
 *        =======
 *         Byte (byte)
 *         **Boolean (boolean)
 *         **Long (long)
 *         **Double (double)
 *         Float (float)
 *         **Integer (int) 
 *         ==> ����ڽ� / ��ڽ�
 *             Integer i=new Integer(1); 
 *             int a=10;
 *             
 *             int b=i;
 *             =========================== IntegerŬ������ �Ϲ� �����Ͱ��� ��� �� �� �ִ� 
 *             Integer i=10;
 *      = Math (��� �޼ҵ尡 static) : ��� ����  
 *          = random() : 0.0~0.99 ������ ������ �߻�  => public static double random();
 *          = ceil() : �ø��޼ҵ� => ������ ��� ��� => ������ ������ (�������� ���ϱ�)
 *                     ** ����¡ ��� 
 *      = Scanner : Ű���� �Է°��� �޴� ��� 
 *   java.util.* => �ݵ�� import�� ����ؼ� Ŭ������ �о�´� 
 *      ***= ��¥
 *      = ���ڿ� �и� 
 *      ***= �÷��� Ŭ���� : �迭 ��� ��� 
 *   java.io.* 
 *   java.net.* 
 *   ==================================================
 *   java.sql.* : Oracle���� (����Ŭ���� ������ �б�)
 *   javax.http.servlet.* : Web���� ��� 
 */
import java.io.*;// ���Ͽ��� ������ �б� 
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // String �̿� 
		String data=""; // movie.txt ���Ͽ��� �����͸� �о �����ϴ� ���� 
		// ���� �б� 
		/*
		 *    IO , SQL , NetWork => CheckException = �ݵ�� ����ó���� �Ѵ� 
		 */
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			// FileInputStream(1byte) , FileReader(2byte): �ѱ� ���� ����
			int i=0; // �ѱ��ھ� �о�´�  => ���ڹ�ȣ�� �д´�  A => 65
			// char => 0~65535 => ��Ƽ����Ʈ (UniCode) => ASC�� UniCode���� (UTF-8)
			//System.out.println((int)'ȫ');
			/*
			 *   ��� 
			 *    while : �ݺ�Ƚ���� ���� ��쿡 �ַ� ���
			 *    for : �ݺ�Ƚ���� ������ ���
			 */
			while((i=fr.read())!=-1) // ������ ���϶����� �д´� (-1:EOF)
			{
				data+=String.valueOf((char)i);
				// valueOf ==> static�޼ҵ� ��� ���������� ���ڿ��� ��ȯ 
				// ����ó�� : ���� �������������� ����ȴ� 
				// ���ڿ�+int => ���ڿ�+(int=>���ڿ�)
			}
			// ���� �ݱ� 
			fr.close();
			// ���� �����͸� ��� �Ѵ� 
			System.out.println("============= ��ȭ ���� =============");
			System.out.println(data);
		}catch(Exception ex) {}
	}

}





















