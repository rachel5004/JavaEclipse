// ������ ���� 
public class ����_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ΰ��� ���� x=10, y=20
		int x=10,y=20;
		x=y;//y�� ������ �ִ� �������� x�� ���� ==> x=20
	    y=x;//x�� ������ �ִ� �������� y�� ���� ==> y=20
	    // 3+7+"5"  => "105"
	    // === 10+"5"==> "105"
	    // �������� , �������� , �������� => ������ �������Ŀ� ��� ����,����,����,����,��� ����Ѵ� 
	    int kor=80;
	    int eng=87;
	    int math=85;
	    int total=kor+eng+math;
	    double avg=total/3.0;
	    
	    System.out.println(kor); //��������:80
	    System.out.println(eng);
	    System.out.println(math);
	    System.out.println(total);// ����:808785
	    //                 ========== "����:80"+87 ==> "����:8087"+85 => ����:808785
	    System.out.println(avg);
	    // 3+5*2 => 13
	    // ����/����=����   => 5/2 => 2.5   5/2=2 5/2.0=2.5
	    
        // int , double , boolean , String
	    char c='A';//65
	    char d='B';//66
	    System.out.println(c+d);
	    String s="A";
	    String s1="B";
	    System.out.println(s+s1); //"AB"
	    
	    /*
	     *   anyŸ��+���ڿ� =���ڿ�  => 10+"a" ==> "10a"
	     *                          "a"+10.0 ==> "a10.0"
	     *   === � ���������̵� ������� 
	     *   char+���忭=���ڿ�
	     *   ����+���ڿ�=���ڿ�
	     *   �Ǽ�+���ڿ�=���ڿ�
	     *   ��+���ڿ�=���ڿ� 
	     *   ���ڿ� + anyŸ�� = ���ڿ�
	     */
	    System.out.println(10/3.0);
	    System.out.printf("%.1f\t",10/3.0); //JDK 1.5 �̻󿡼� ���� ������ ��� (C���)
	    // exe���� => ����
	    /*
	     *   ������ �ִ� ��� 
	     *   ����ȣ 
	     *    %d ==> ����
	     *    %c ==> ����
	     *    %s ==> ���ڿ� 
	     *    %f ==> �Ǽ� 
	     *    
	     *    ==> Ư����ȣ 
	     *    \n => new Line : �����ٿ� ���  <br>
	     *    \t => tab : ���� ���� &nbsp;
	     *   
	     */
	    System.out.printf("%d\t", 100);
	    System.out.printf("%s\n","Hello");
	    System.out.printf("%c\n",'A');
	    
	    System.out.println("100  80  70");
	    System.out.printf("%-5d%-5d%-5d",100,80,70);
	    /*
	     *    000000000000000
	     *      100   80   70
	     *      
	     *      %5d => ������ 
	     *      %-5d => ����
	     *      
	     *      ��¿��� ���� ���� ����ϴ� ����? System.out.println()
	     *    
	     */
	    
	}

}











