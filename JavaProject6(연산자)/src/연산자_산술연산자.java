/*
 *    ��������� = ���׿����� (�������� 2���� �ʿ�)
 *    ========
 *      + (����) , -(����)  , *(����)  , /(������)  , %(������)
 *      1) �켱���� 
 *         * , / , % = + , -
 *         ��)  () => �ֿ켱���� ������
 *             3+(5*10) =>  5*10 50+3 => 53
 *              = =
 *              2 1
 *      2) �ٸ� ���������� ������ �� ��� (���� ū ������������ �����Ŀ� ����)
 *         int + double 
 *         ===
 *         double    ==>  double+double (������ �׻� ���� ���������� ����ó���� �ȴ�) => �ڵ�����ȯ 
 *         ��)
 *             10 + 10.5
 *             ===
 *             10.0
 *             10.0+10.5=20.5
 *         char + int 
 *         ====
 *          int�� ��ȯ ===> int + int = int
 *         ��)
 *             'A'+100
 *             ===
 *              65 
 *             ===========> 65+100=165 ==> ���ڷ� ��ȯ  (char)165
 *         int + long 
 *         ===
 *         long
 *         ��)
 *             10+100L
 *             ==
 *             10L ======> 10L+100L ==> 110L
 *         ============================================
 *         char + byte = ����� ( int )
 *         short + short = int
 *         
 *          int���� �������� (char,byte,short)�� ����ÿ� ������� int
 *         ============================================
 */
public class ������_��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=10;
		byte b2=20;
		int b3=b1+b2;
		System.out.println("b3="+b3);
		/*
		 *   byte b3=(byte)(b1+b2)
		 *   int b3=b1+b2
		 */
       int a=10;
       double d=10.5;
       // a+d �� ������� ��� 
       //int res=(int)(a+d);
       int res=a+(int)d;
       // a=10.0 d=10.5  ==> 10.0+10.5=20.5
       System.out.println(res);
       
       double d1=10.5;
       double d2=10.5;
       //int res1=(int)(d1+d2); ==> d1+d2=21.0  ==> (int)21.0 ==> 21
       //           2     1
       int res1=(int)d1+(int)d2;
       //          1   3   2
       //        10    +   10 20
       System.out.println(res1);
       
       // ���� ==> (-)
       int i=10;
       int j=6;
       // i,j
       int z=i-j;
       System.out.println("z="+z);
       
       // ���� ==> (*)
       i=10;
       j=6;
       z=i*j;
       System.out.println("z="+z);
       
	}

}






















