import java.util.Scanner;
/*
 *    ����
 *      = ������� 
 *      = �������� : static 
 *      = �������� 
 *    �޼ҵ� 
 *      = ����޼ҵ�
 *      = �����޼ҵ�(Ŭ�����޼ҵ�) : static
 *      = �߻�޼ҵ� 
 *    =================================
 *    1. �����͸� ��� ó��
 *    2. ��ɹ��� ��� ó��
 *    ==================== + Ŭ����(����+�޼ҵ�)
 */
public class �޼ҵ�Ȱ��_5 {
    // 1. �޴� 
	//  int m=menu()
	//  m=>return���� �޴� ���� 
	static int menu()
	{
		Scanner scan=new Scanner(System.in);// �޴�����
		// �޴��� �����ش� 
		System.out.println("================= �޴� ================");
		System.out.println("1. ���� Top50 ��ü ����");
		System.out.println("2. �뷡 �˻�");
		System.out.println("3. ������ �˻�");
		System.out.println("4. �� ����");
		System.out.println("5. ���α׷� ����");
		System.out.println("======================================");
		int m=0;
		while(true)
		{
			System.out.print("�޴��� �����ϼ���(1~5)?");
			m=scan.nextInt();
			if(m<1 || m>5)
			{
				System.out.println("���� �޴��Դϴ�!!");
				continue; // while ó������ �̵�
			}
			break; // while�� ����
		}
		return m;
	}
	// 2. ��ü ���
	static void musicAllData()
	{
		String[] title=�޼ҵ�Ȱ��_4.title;
		String[] singer=�޼ҵ�Ȱ��_4.singer;
		String[] album=�޼ҵ�Ȱ��_4.album;
		System.out.println("************************ ���� ��ü ��� ****************************");
		for(int i=0;i<50;i++)
		{
			System.out.println("�뷡��:"+title[i]);
			System.out.println("������:"+singer[i]);
			System.out.println("�ٹ�:"+album[i]);
			System.out.println("*****************************************************************");
		}
		
	}
	// 3. �뷡 ã��
	static void musicFindData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("�뷡 �˻�:");
		String ss=scan.next();
		String[] title=�޼ҵ�Ȱ��_4.title;
		System.out.println("************************ �˻���� **************************");
		for(String s:title)
		{
			if(s.contains(ss))
			{
				System.out.println(s);
			}
		}
	}
	// 4. ���������� �뷡ã��
	static void singerFindData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է�:");
		String s=scan.next();
		String[] title=�޼ҵ�Ȱ��_4.title;
		String[] singer=�޼ҵ�Ȱ��_4.singer;// index��ȣ 
		System.out.println("************************ �˻���� **************************");
		for(int i=0;i<50;i++)
		{
			if(singer[i].startsWith(s))
			{
				System.out.println(title[i]);
			}
		}
	}
	// 5. �󼼺��� 
	static String[] detailData()
	{
		String[] result=new String[4];
		Scanner scan=new Scanner(System.in);
		String[] title=�޼ҵ�Ȱ��_4.title;
		System.out.println("======================== ���� ��� ==============================");
		for(int i=0;i<50;i++)
		{
			System.out.println((i+1)+"."+title[i]);
		}
		System.out.print("���뺼 ��ȣ�� �����ϼ���(1~50):");
		int selNum=scan.nextInt();
		//System.out.println("==========================================================");
		String mTitle=�޼ҵ�Ȱ��_4.title[selNum-1];
		String singer=�޼ҵ�Ȱ��_4.singer[selNum-1];
		String album=�޼ҵ�Ȱ��_4.album[selNum-1];
		String state=�޼ҵ�Ȱ��_4.state[selNum-1];
		int modify=�޼ҵ�Ȱ��_4.modify[selNum-1];
		
		//System.out.println("�뷡��:"+mTitle);
		//System.out.println("������:"+singer);
		//System.out.println("�ٹ�:"+album);
		String ss="";
		if(state.equals("���"))
		{
			ss="��"+modify;
		}
		else if(state.equals("�ϰ�"))
		{
			ss="��"+modify;
		}
		else // ����
		{
			ss="-";
		}
		//System.out.println("����:"+ss);
		//System.out.println("==========================================================");
		result[0]=mTitle;
		result[1]=singer;
		result[2]=album;
		result[3]=ss;
		return result;
	}
	// 6. ����
	// ����=> ���� 
	static void process()
	{
		while(true)
        {
        	int m=menu();
        	switch(m)
        	{
        	case 1:
        		musicAllData();
        		break;
        	case 2:
        		musicFindData();
        		break;
        	case 3:
        		singerFindData();
        		break;
        	case 4:
        		String[] s=detailData();
        		System.out.println("�뷡��:"+s[0]);
        		System.out.println("������:"+s[1]);
        		System.out.println("�ٹ�:"+s[2]);
        		System.out.println("����:"+s[3]);
        		break;
        	case 5:
        		System.out.println("���α׷� ����");
        		System.exit(0);// ���α׷� ����
        		//break;
        	}
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}







