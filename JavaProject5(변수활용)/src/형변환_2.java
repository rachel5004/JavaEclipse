
public class ����ȯ_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		byte b=(byte)i;
		// byte b=10
		System.out.println("i="+i+",b="+b);
		
		i=350; // 350-256 ==> 94
		b=(byte)i; // �����÷ο� (b=(-128~127))
		System.out.println("i="+i+",b="+b);
		// 0010 1100  ==> 32+8+4 ==> 44
		//b => 8bit (0,1=>8���� ����)
		/*
		 *    256 128 64  32  16  8  4  2  0
		 *     1   0   0   1   0  1  1  0  0
		 *     
		 *     300=> 2����
		 *     1 0010 1100
		 */

	}

}






