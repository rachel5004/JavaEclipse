import java.util.*;
public class javaQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String course[]={"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
    	int score[]={95, 88, 76, 62, 55};
    	while(true) {
    		boolean b = false;
    		System.out.print("���� �̸�>> ");
    		String crs = sc.next();
    		if (crs.equals("�׸�")) break;
    		for(int i=0;i<course.length;i++) {
    			if(crs.equals(course[i])) {
    				b = true;
    				System.out.println(crs+"�� ������ "+score[i]);
    				break;
    			}
    		}
    		if(b == false)
    			System.out.println("���� �����Դϴ�.");
    	}
	}
}

	
