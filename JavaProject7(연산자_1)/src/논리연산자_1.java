/*
 *    �������� : ȿ������ ���ó��
 *    && : �������� ������ false => false
 *    || : �������� ������ true => true
 */
public class ��������_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
        int a=10;
        int b=9;
        boolean bCheck=(a>b && ++b==a);
        /*
         *    a>b ==> 10>9 ==> true
         *    ++b==a  10==10 ==> true 
         *    true && true = true
         */
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("���:"+bCheck);
        long end=System.currentTimeMillis();
        System.out.println("����ð�:"+(end-start));
        // ȿ������ ��� 
        
        start=System.currentTimeMillis();
        a=10;
        b=9;
        bCheck=(a<b && ++b==a);
        /*
         *    a<b ==> 10<9 ==> false
         *    => false
         */
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("���:"+bCheck);
        end=System.currentTimeMillis();
        System.out.println("����ð�:"+(end-start));
        
	}

}
