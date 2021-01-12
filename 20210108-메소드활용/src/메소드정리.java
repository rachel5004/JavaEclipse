/*
 *   ���α׷� ��� => ��ǻ�� ����� ������ ���
 *   �޼ҵ� : �Ѱ��� ����� �����ϱ� ���� ��ɹ��� ���� 
 *           ������ ���� 
 *           �ݺ��� ������ �� �ִ� 
 *           �޼ҵ� ȣ�� => �޼ҵ��(��...) => �޼ҵ� {}�� �ִ� ��� ������ �����ϰ� �ٽ� ȣ��� ��ġ ����
 *          =================================
 *          ** ��ɹ� 
 *             int a=10; // 10�� a��� �޸� ������ �����϶� 
 *             int b=20;
 *             System.out.println(a+b);
 *         ����)
 *               ������(�����) �޼ҵ��(�Ű�����...)
 *               {
 *                  ������ ������ �ڵ� 
 *               }
 *               
 *               int[] arr={1,2,3,4,5}
 *               = ������(O)   �Ű�����(O)
 *                 *** ������ : ����ڰ� ��û�� ���� ó���Ŀ� ������ ����� (������� �ݵ�� �Ѱ����� �� �ִ�)
 *                            �������� ��� : �迭,Ŭ���� 
 *                                         ========= �Ѱ�
 *                            = ��� �޼ҵ�� �޼ҵ� ���Ḧ ���ؼ� return�� ��� 
 *                              return ��; (void�� ��쿡�� return�� ����)
 *                 *** �Ű����� :����ڷκ��� ������ �����͸� �޴´� 
 *               = ������(O)   �Ű�����(X)
 *               = ������(X)   �Ű�����(O)
 *               = ������(X)   �Ű�����(X)
 *               
 *               �޼ҵ�� �ҽ��� ���ų� ������ ��쿡 => �и� 
 */
/*
 *   1. �ݺ��� ���� (*******)
 *   2. ������ �ٽ� ��� (******)
 *   3. ������ �ҽ��ڵ� 
 */
public class �޼ҵ����� {

	// ����ϴ� �޼ҵ� 
	static void print(int[] arr)
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	// �����ϴ� �޼ҵ� 
	static int[] sort_asc(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	static int[] sort_desc(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	static int[] sort(int[] arr,String type)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			   if(type.equals("DESC"))
			   {
					if(arr[i]<arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			   }
			   else
			   {
				    if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			   }
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={30,20,50,10,40};
		System.out.println("====== ���� �� ======");
		// ��� : for-each => �������� ��� , �������� �迭�� ���� ���
		/*
		 * for(int i:arr) { System.out.print(i+" "); }
		 */
		print(arr);
		System.out.println("\n===== ���� ��(ASC:�ø�����) =====");
		/*       
		 *     i  30 20 50 10 40
		 *        == == 
		 *        20 30
		 *        ==    ==
		 *        20    50
		 *        ==       ==
		 *        10       20
		 *        ==          ==
		 *        10          40
		 */
		/*for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		int[] arr1=sort(arr,"ASC");//sort_asc(arr);
		// ��� 
		/*for(int i:arr)
		{
			System.out.print(i+" ");
		}*/
		print(arr1);
		System.out.println("\n===== ���� ��(DESC:��������) =====");
		/*for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		int[] arr2=sort(arr,"DESC");//sort_desc(arr);
		// ��� 
		/*for(int i:arr)
		{
			System.out.print(i+" ");
		}*/
		print(arr2);

	}

}






















