// ���̺귯�� �̿� 
public class �迭����_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names={"ȫ�浿","�̼���","������","��������","�ڹ���"};
		String[] members=new String[10];
		
		int[] arr= {10,20,30,40,50};
		double[] dd=new double[10];
		
		// ==>  dd[0]=arr[0]
		// ==> double d=10;  => 10.0
		//System.arraycopy(arr, 0, dd, 0, arr.length);
		for(int i=0;i<arr.length;i++)
		{
			dd[i]=arr[i];
		}
		for(double d:dd)
		{
			System.out.println(d);
		}
		// Object src, int srcPos, Object dest, int destPos, int length)
		/*
		 *         0       1      2       3       4
		 *      ========================================
		 *       "ȫ�浿","�̼���","������","��������","�ڹ���"  names
		 *      ========================================
		 *         0     1     2     3     4     5      6     7     8     9
		 *      =============================================================
		 *        null  null  null  "ȫ�浿","�̼���","������","��������","�ڹ���"  null  null   members
		 *      =============================================================
		 */
		System.arraycopy(names, 4, members,9, 1);
		//    members[9]=names[4];
		// ����
		for(String name:members)
		{
			System.out.println(name);
		}

	}

}
