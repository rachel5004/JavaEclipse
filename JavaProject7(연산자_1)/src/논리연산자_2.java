/*
 *    || ������
 *    ����) 
 *         (����) || (����)
 *         =====    =====  ������ �׻� true/false  ==> ���� ����� : true/false
 *         ���� ���鶧 : ����� �� �ִ� ������ (���������� , �񱳿�����)
 *                                        ! (boolean) , == , != , < , > , <= ,>=
 *         (����) || (����)
 *         true     true   ===> true
 *         true     false  ===> true
 *         false    true   ===> true
 *         false    false  ===> false
 *         =====    =====
 *           1   ||   2
 *              ====
 *               3   ====> �����
 *         *** ȿ������ ���� 
 *             = �������� ������ true�� ��쿡..
 *             
 *         *** ������ �� �ִ� �Ⱓ 
 */
public class ��������_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=9;
        boolean bCheck=(a%2==0 || ++b==a);
        /*
         *     a%2==0 ==> 10%2==0 true
         *     //++b==a ==> ���� �˻��� ���� �ʾҴ� 
         *     //�ΰ��� ��� || ����ó��  ==> true
         */
        System.out.println("a%2==0 || ++b==a?"+bCheck);
        System.out.println("a="+a);
        System.out.println("b="+b);
        
        bCheck=(a%2!=0 || ++b==a);
        /*
         *    a%2!=0 => 10%2!=0 => false
         *    ++b==a => 10==10  => true  ===> ������ �˻� 
         *    false || true = true
         */
        System.out.println("a%2!=0 || ++b==a?"+bCheck);
        System.out.println("a="+a);
        System.out.println("b="+b);
	}

}













