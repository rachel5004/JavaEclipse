/*
 *   ��������� 
 *     / , %
 *     ������(/) 
 *       1. 0���� ���� �� ����     10/0 => error
 *       2. ����/����=����
 *          5/2=2.5(X)   5/2=2  ==> 5/2.0 =2.5
 *          double d=5/2.0 ==> 2.0
 *     % ������ �������� => ��� 
 *       1. ������ : ������� �������� ��ȣ�� ���󰣴� 
 *          5%2  ===> 1  1+4/2
 *          -5%2 ===> -1 -1-4/2
 *          5%-2 ===> 1  1+4/2
 *          -5%-2 ===> -1      -5*-2=10  -1-4/-2
 *          
 *          ���ڿ� �Է��� �޾Ƽ� �¿��Ī���� ���θ� ��� 
 *          ABBA
 *          
 *        ==> �ڵ� ����ȯ 
 *        ==> ���α׷��Ӱ� ���� (���� ����ȯ)
 */
// ����ȭ 
// ������ ���� (���� ����) 
public class ������_���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=3;
		System.out.println(a/(double)b);
		//a=10;
		//b=0;
		//System.out.println(a/b); 
		int a1=5;
		int a2=2;
		int a3=-5;
		int a4=-2;
		System.out.println(a1%a2);// 5%2 = 1
		System.out.println(a1%a4);// 5%-2 =1
		System.out.println(a3%a2);// -5%2 =-1
		System.out.println(a3%a4);// -5%-2=-1
	}

}

















