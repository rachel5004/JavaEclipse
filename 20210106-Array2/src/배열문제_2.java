/*
 *   String course[]={"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
     int course[]={95, 88, 76, 62, 55};
        ���� �̸� >>  Jaba
		���� �����Դϴ�
		���� �̸� >>  Java
		Java�� ������ 95
		���� �̸� >>  C++
		C++�� ������ 88
		���� �̸� >>  �׸�
 */
import java.util.Scanner;
public class �迭����_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[]={"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
	    int jumsu[]={95, 88, 76, 62, 55};
	    // �Է°� 
	    Scanner scan=new Scanner(System.in);
	    
	    while(true)
	    {
	    	boolean bCheck=false;
	    	System.out.print("���� �̸� >>");
	    	String subject=scan.next();
	    	if(subject.equals("�׸�"))
	    	{
	    		break;
	    	}
	    	for(int i=0;i<course.length;i++)
	    	{
	    		if(subject.equals(course[i]))
	    		{
	    			bCheck=true;
	    			System.out.println(subject+"�� ������ "+jumsu[i]);
	    			break;
	    		}
	    	}
	    	if(bCheck==false)
	    	{
	    		System.out.println("���� �����Դϴ�");
	    	}
	    }
	}

}








